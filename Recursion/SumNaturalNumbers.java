
public class SumNaturalNumbers {

    public static int sumOfNatural(int n) {

        if (n == 1) {
            return 1;
        }

        int sum = 0;
        sum = n + sumOfNatural(n - 1);
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfNatural(10));
        // int var = 0;
        // for (int i = 1; i < 11; i++) {
        //     var += i;
        // }
        // System.out.println(var);
    }
}
