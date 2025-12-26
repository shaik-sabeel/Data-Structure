
public class IncreasingNumber {

    public static void numberIncrease(int n) {
        if (n == 0) {
            return;
        }

        numberIncrease(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        numberIncrease(n);
    }
}
