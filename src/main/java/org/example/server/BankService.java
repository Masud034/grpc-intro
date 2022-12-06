package org.example.server;

import com.masudulalam.models.*;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
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
}
