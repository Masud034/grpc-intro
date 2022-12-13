package org.example.server;

import com.masudulalam.models.Balance;
import com.masudulalam.models.DepositRequest;
import io.grpc.stub.StreamObserver;


public class CashStreamingRequest implements StreamObserver<DepositRequest> {

    private final StreamObserver<Balance> balanceStreamObserver;
    private int accountBalance;

    public CashStreamingRequest(StreamObserver<Balance> balanceStreamObserver) {
        this.balanceStreamObserver = balanceStreamObserver;
    }

    @Override
    public void onNext(DepositRequest depositRequest) {
        accountBalance = AccountDatabase.addBalance(depositRequest.getAccountNumber(), depositRequest.getAmount());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {
        Balance balance = Balance
                .newBuilder()
                .setAmount(accountBalance)
                .build();
        balanceStreamObserver.onNext(balance);
        balanceStreamObserver.onCompleted();
    }
}
