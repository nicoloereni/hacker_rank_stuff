import java.util.*;

public class CalendarExercise {
    private static final Map<Integer, String> DAYS = new HashMap<>();
    static {
        DAYS.put(Calendar.SUNDAY, "SUNDAY");
        DAYS.put(Calendar.MONDAY, "MONDAY");
        DAYS.put(Calendar.TUESDAY, "TUESDAY");
        DAYS.put(Calendar.WEDNESDAY, "WEDNESDAY");
        DAYS.put(Calendar.THURSDAY, "THURSDAY");
        DAYS.put(Calendar.FRIDAY, "FRIDAY");
        DAYS.put(Calendar.SATURDAY, "SATURDAY");
    }

    public static String getDay(String day, String month, String year) {
        String result = "";
        if (isYearValid(year)) {
            int parsedDay = Integer.parseInt(day);
            int parsedMonth = Integer.parseInt(month) -1;
            int parsedYear = Integer.parseInt(year);

            Calendar calendar = new GregorianCalendar(parsedYear, parsedMonth, parsedDay);
            result = DAYS.get(calendar.get(calendar.DAY_OF_WEEK));
        }

        return result;
    }

    private static boolean isYearValid(String year) {
        int parsewdYear = Integer.parseInt(year);
        return parsewdYear < 3000 && parsewdYear > 2000;
    }
}