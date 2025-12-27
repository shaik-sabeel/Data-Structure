
public class Power {

    public static int powerN(int n, int pow) {

        if (pow == 0) {
            return 1;
        }

        int p = 1;
        p = n * powerN(n, pow - 1);
        return p;
    }

    public static int optimisedPower(int n, int power) {

        if (power == 0) {
            return 1;
        }

        int halfpower = optimisedPower(n, power / 2);
        int halfsqrt = halfpower * halfpower;

        if (power % 2 != 0) {
            halfsqrt = n * halfsqrt;
        }

        return halfsqrt;
    }

    public static void main(String[] args) {
        System.out.println(powerN(2, 10));
        System.out.println(optimisedPower(2, 10));
    }
}
