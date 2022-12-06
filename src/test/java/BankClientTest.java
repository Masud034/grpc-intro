import com.masudulalam.models.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankClientTest {
    private static BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub;

    @BeforeAll
    public static void setup() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        bankServiceBlockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
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
                .setAmount(40)
                .build();

        Balance balance = bankServiceBlockingStub.deductBalance(withdrawRequest);
        System.out.println("After deducting 40 from the previous balance : " +balance);
    }
}
