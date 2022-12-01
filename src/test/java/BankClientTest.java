import com.masudulalam.models.Balance;
import com.masudulalam.models.BalanceRequest;
import com.masudulalam.models.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
    public void balanceTest() {
        BalanceRequest balanceRequest = BalanceRequest
                .newBuilder()
                        .setAccountNumber(5)
                                .build();

        Balance balance = bankServiceBlockingStub.getBalance(balanceRequest);
        System.out.println(balance.getAmount());
    }
}
