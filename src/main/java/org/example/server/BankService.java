package org.example.server;

import com.masudulalam.models.*;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    //unary
    @Override
    public void getBalance(BalanceRequest request, StreamObserver<Balance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance
                .newBuilder()
                .setAmount(AccountDatabase.getBalance(accountNumber))
                .build();
        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }

    @Override
    public void addBalance(DepositRequest request, StreamObserver<Balance> responseObserver) {
        Balance balance = Balance
                .newBuilder()
                .setAmount(AccountDatabase.addBalance(request.getAccountNumber(), request.getAmount()))
                .build();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }

    @Override
    public void deductBalance(WithdrawRequest request, StreamObserver<Balance> responseObserver) {
        Balance balance = Balance
                .newBuilder()
                .setAmount(AccountDatabase.deductBalance(request.getAccountNumber(), request.getAmount()))
                .build();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }
    //server side streaming

    @Override
    public void getMoneyStream(WithdrawRequest request, StreamObserver<Money> responseObserver) {
        int balance = AccountDatabase.getBalance(request.getAccountNumber());
        if (request.getAmount() <= balance) {
            for (int i = 0; i < (request.getAmount() / 10 ); i++) {
                Money money = Money
                        .newBuilder()
                        .setValue(10)
                        .build();
                responseObserver.onNext(money);
                AccountDatabase.deductBalance(request.getAccountNumber(), 10);
            }
        }
        else {
            Status status = Status.FAILED_PRECONDITION.withDescription("Not enough balance, you only have " + balance);
            responseObserver.onError(status.asRuntimeException());
        }
        responseObserver.onCompleted();
    }

    //client side streaming

    @Override
    public StreamObserver<DepositRequest> addBalanceStream(StreamObserver<Balance> responseObserver) {
        return new CashStreamingRequest(responseObserver);
    }
}
