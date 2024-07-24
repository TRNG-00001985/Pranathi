import java.util.*;

public class LeapYear {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println(" Not a Leap Year");
        }
    }
}