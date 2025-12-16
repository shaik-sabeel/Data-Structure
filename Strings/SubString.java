
public class SubString {

    public static void sub(String word, int st, int end) {
        String substr = "";
        for (int i = st; i < end; i++) {
            substr += word.charAt(i);
        }

        System.out.println(substr);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        sub(str, 3, 6);
    }
}
