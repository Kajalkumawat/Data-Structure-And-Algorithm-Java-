public class PrintTable {
    public static void printn(int start, int end, int n) {
        if (start > end) {
            return;
        }
        System.out.print(start*n+" ");
        printn(start + 1, end, n);
      
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int n = 2;
        printn(start, end, n);
    }
}
