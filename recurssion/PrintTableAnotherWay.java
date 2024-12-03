public class PrintTableAnotherWay {
    static void print(int n1, int n2) {
        if (n1 == 0) {
            return;
        }
        print(n1 - 1, n2);
        System.out.print(n1 * n2 + " ");
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 2;
        print(n1, n2);

    }
}
