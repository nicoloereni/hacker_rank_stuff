import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import static java.text.NumberFormat.getCurrencyInstance;

public class CurrencyExercise {

    private static final Map<String, Locale> LOCALE_HASH_MAP = new HashMap<>();
    static {
        LOCALE_HASH_MAP.put("US", Locale.US);
        LOCALE_HASH_MAP.put("India", new Locale("hi", "IN"));
        LOCALE_HASH_MAP.put("China", Locale.CHINA);
        LOCALE_HASH_MAP.put("France", Locale.FRANCE);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + getFormattedPayment("US", payment));
        System.out.println("India: " + getFormattedPayment("India", payment));
        System.out.println("China: " + getFormattedPayment("China", payment));
        System.out.println("France: " + getFormattedPayment("France", payment));
    }

    //public just for testing it
    public static String getFormattedPayment(String country, double payment)
    {
        return getCurrencyInstance(LOCALE_HASH_MAP.get(country)).format(payment);
    }

}
