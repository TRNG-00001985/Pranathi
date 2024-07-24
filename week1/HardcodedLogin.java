import java.util.*;

public class HardcodedLogin {
    public static void main(String[] args) {
        System.out.println("Enter your option:");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to login using Name");
        System.out.println("Enter 2 to login using Email");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println(s.next());
                System.out.println("Login Success");
                break;
            case 2:
                System.out.println(s.next());
                System.out.println("Login Success");
                break;
            default:
                System.out.println("select correct choice to Login");

        }

    }
}