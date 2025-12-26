
public class DecreasingNumber {

    void decreasingNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        decreasingNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        DecreasingNumber x = new DecreasingNumber();
        x.decreasingNumbers(n);
    }
}
