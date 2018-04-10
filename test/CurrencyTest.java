
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CurrencyTest {

    @Test
    public void usCurrencyFormatted() throws Exception
    {
        assertEquals("$12,324.13", CurrencyExercise.getFormattedPayment("US", 12324.134));
    }
}
