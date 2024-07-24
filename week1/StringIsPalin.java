import java.util.*;

public class StringIsPalin {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hiih");
        System.out.println(str.toString().equals(str.reverse().toString()));

    }
}