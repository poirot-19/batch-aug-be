package JavaStrings;

public class StringBuilderExample{
    public static void main(String[] args) {
        int n = 1000000;
//        funWithStrings(n);
        funWithStringBuilders(n);
    }
    // time taken by strings for 100 0
    // time taken by strings for 1000 17
    // time taken by strings for 10000 452
    // time taken by strings for 100000 elements 26862

    // time taken by stringBuilder for 100 elements 0
    // time taken by stringBuilder for 1000 elements 1
    // time taken by stringBuilder for 10000 elements 2
    // time taken by stringBuilder for 100000 elements 9
    // time taken by stringBuilder for 1000000 elements 65

    public static void funWithStrings(int n){
        String s = "";
        long startTime = System.currentTimeMillis();
        for(int i = 1; i<=n; i++){
            s +=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time taken by strings for " + n + " elements " + (endTime-startTime));
    }

    public static void funWithStringBuilders(int n){
        StringBuilder s = new StringBuilder("");
        long startTime = System.currentTimeMillis();
        for(int i = 1; i<=n; i++){
            s.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time taken by stringBuilder for " + n + " elements " + (endTime-startTime));
    }
}
