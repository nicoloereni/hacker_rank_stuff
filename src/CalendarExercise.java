import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class CalendarExercise {
    public static String getDay(String day, String month, String year) {
        String result = "";
        if (isYearValid(year)) {
            int parsedDay = Integer.parseInt(day);
            int parsedMonth = Integer.parseInt(month) -1;
            int parsedYear = Integer.parseInt(year);

            Calendar calendar = new GregorianCalendar(parsedYear, parsedMonth, parsedDay);
            result = dayFromPosition(calendar.get(calendar.DAY_OF_WEEK));
        }

        return result;
    }

    private static String dayFromPosition(int position) {
        Map<Integer, String> days = new HashMap<>();
        days.put(Calendar.SUNDAY, "SUNDAY");
        days.put(Calendar.MONDAY, "MONDAY");
        days.put(Calendar.TUESDAY, "TUESDAY");
        days.put(Calendar.WEDNESDAY, "WEDNESDAY");
        days.put(Calendar.THURSDAY, "THURSDAY");
        days.put(Calendar.FRIDAY, "FRIDAY");
        days.put(Calendar.SATURDAY, "SATURDAY");

        return days.get(position);
    }

    private static boolean isYearValid(String year) {
        int parsewdYear = Integer.parseInt(year);
        return parsewdYear < 3000 && parsewdYear > 2000;
    }
}