import com.masudulalam.models.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.server.BalanceStreamObserver;
import org.junit.jupiter.api.*;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankClientTest {
    private static BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub;

    //async stub
    private static BankServiceGrpc.BankServiceStub bankServiceStub;



    @BeforeAll
    public static void setup() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        bankServiceBlockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        bankServiceStub = BankServiceGrpc.newStub(managedChannel);
    }

    @Test
    @Order(1)
    public void balanceTest() {
        BalanceRequest balanceRequest = BalanceRequest
                .newBuilder()
                        .setAccountNumber(5)
                                .build();

        Balance balance = bankServiceBlockingStub.getBalance(balanceRequest);
        System.out.println("Initital balance : " +balance);
    }

    @Test
    @Order(2)
    public void addBalanceTest() {
        DepositRequest depositRequest = DepositRequest
                .newBuilder()
                .setAccountNumber(5)
                .setAmount(50)
                .build();

        Balance balance = bankServiceBlockingStub.addBalance(depositRequest);
        System.out.println("After adding 50 to the previous balance : " +balance);
    }

    @Test
    @Order(3)
    public void deductBalanceTest() {
        WithdrawRequest withdrawRequest = WithdrawRequest
                .newBuilder()
                .setAccountNumber(5)
                .setAmount(20)
                .build();

        Balance balance = bankServiceBlockingStub.deductBalance(withdrawRequest);
        System.out.println("After deducting 40 from the previous balance : " +balance);
    }
    //server streaming balance deduction
    @Test
    @Order(4)
    public void deductBalanceWithStreamingTest() {
        WithdrawRequest withdrawRequest = WithdrawRequest
                .newBuilder()
                .setAccountNumber(5)
                .setAmount(20)
                .build();

        Iterator<Money> balance = bankServiceBlockingStub.getMoneyStream(withdrawRequest);
        System.out.println("Server streaming money receive -->>");
        balance.forEachRemaining(System.out::println);
    }

    @Test
    @Order(5)
    public void addBalanceWithStreamingTest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StreamObserver<DepositRequest> depositRequestStreamObserver = bankServiceStub.addBalanceStream(new BalanceStreamObserver(countDownLatch));
        for (int i = 0; i < 5; i++) {
            DepositRequest depositRequest = DepositRequest
                    .newBuilder()
                    .setAccountNumber(5)
                    .setAmount(16)
                    .build();
            depositRequestStreamObserver.onNext(depositRequest);
        }
        depositRequestStreamObserver.onCompleted();
        countDownLatch.await();
    }
}
