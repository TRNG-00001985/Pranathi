import java.util.ArrayList;
import java.util.List;

public class MostCommonChar {
    public static void main(String[] args) {
        int[] arr = new int[26];
        String s = "MostCommonCharacter";
        String ss = s.toLowerCase();
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z') {
                arr[ss.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        List<Character> mostCommonChars = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                mostCommonChars.clear();
                mostCommonChars.add((char) (i + 'a'));
            } else if (arr[i] == max) {
                mostCommonChars.add((char) (i + 'a'));
            }
        }
        for (char c : mostCommonChars) {
            System.out.print(c + " ");
        }
    }

}
