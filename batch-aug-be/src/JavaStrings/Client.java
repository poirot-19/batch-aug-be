package JavaStrings;

public class Client {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "1";
        int s5 = 1;
        System.out.println("Comparing S1 and S2 " + s1==s2);
        System.out.println("Comparing S2 and S3 " + s2==s3);
        System.out.println("Comparing S2 and S3 " + s2.equals(s3));
        System.out.println("Comparing S2 and S3 " + s4.equals(s5));

        String s7 = "Hello";
        System.out.println(s7);
        s7 = "bye";
        System.out.println(s7);
    }
}
