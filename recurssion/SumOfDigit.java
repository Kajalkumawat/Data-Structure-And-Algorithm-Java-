public class SumOfDigit {
    // through recurssion
    public static int sod(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int small = sod(n / 10);
        int sum = small + n % 10;
        return sum;
    }

    public static void main(String[] args) {
        int n = 523;
        System.out.println(sod(n));
        // while loop
        // int rem, sum = 0;
        // while (n > 0) {
        // rem = n % 10;
        // sum = sum + rem;
        // n = n / 10;
        // }
        // System.out.println(sum);
    }
}