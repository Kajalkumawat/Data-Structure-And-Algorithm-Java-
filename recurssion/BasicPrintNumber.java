
public class BasicPrintNumber {
    public static void printNum(int n) {
        if (n == 0) {
            return;// it is used to terminate the method
        }
        printNum(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNum(5);
    }
}
