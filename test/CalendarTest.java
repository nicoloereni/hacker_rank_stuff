
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalendarTest {
    private CalendarExercise solution;

    @Test
    public void getDayFromDate() throws Exception
    {
        solution = new CalendarExercise();
        assertEquals("FRIDAY", solution.getDay("06", "04", "2012"));
    }
}
