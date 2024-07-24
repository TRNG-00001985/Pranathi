public class WordCount {
    public static void main(String[] args) {
        String str = "You are the best";
        str.trim();
        System.out.println(str.split("\\s").length);
    }
}