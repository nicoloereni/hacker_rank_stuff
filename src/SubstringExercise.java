import java.util.Scanner;

public class SubstringExercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        int stringLength = s.length();

        if((1 <= stringLength) && (100 >= stringLength) && (end > start) && (start >= 0) && (end <= stringLength))
        {
            System.out.println(s.substring(start, end));
        }
    }
}
