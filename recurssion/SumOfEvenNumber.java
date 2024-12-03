public class SumOfEvenNumber {
    public static int sum(int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start % 2 == 0) {
            return sum(start + 1, end) + start;
        }
        return sum(start + 1, end);
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 5;

    }
}
