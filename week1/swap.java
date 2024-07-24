public class swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 17;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}