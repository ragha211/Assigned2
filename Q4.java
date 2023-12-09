public class Q4 {
    public static void main(String[] args) {

        long maxLongValue = Long.MAX_VALUE;
        long increment = 128;
        long numberOfCalls = maxLongValue / increment;
         System.out.println("Number of calls before long-integer overflow: " + numberOfCalls);
    }
}