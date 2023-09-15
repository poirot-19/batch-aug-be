package JavaStrings;

public class ClientReplace {
    public static void main(String[] args) {
        String s1 = "hello";
        s1.replace('l', 'd');
        System.out.println(s1);
        String s2 = s1.replace('l', 'd');
        System.out.println(s2);
    }
}
