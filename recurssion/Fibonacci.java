public class Fibonacci {
    public static int fibonaccin(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int pre = fibonaccin(n - 1);
        int prepre = fibonaccin(n - 2);
        return pre + prepre;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonaccin(n));
    }
}
