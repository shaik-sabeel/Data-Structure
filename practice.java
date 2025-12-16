
import java.util.*;

public class Practice {

    public static boolean arrayStringsAreEqual(String[] str1, String[] str2) {
        String ch1 = "";
        for (int i = 0; i < str1.length; i++) {
            ch1 = ch1 + str1[i];
        }
        ch1 = ch1.toLowerCase();

        String ch2 = "";
        for (int i = 0; i < str2.length; i++) {
            ch2 = ch2 + str2[i];
        }
        ch2 = ch2.toLowerCase();

        return ch1.equals(ch2);
    }

    public static void main(String[] args) {

        String[] str1 = {"abc", "d", "defg"};
        String[] str2 = {"abc", "efg"};

        System.out.println(arrayStringsAreEqual(str1, str2));
    }
}
