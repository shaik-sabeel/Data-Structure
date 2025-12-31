
public class RemoveDuplicates {

    public static void duplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {

            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            duplicate(str, idx + 1, newStr, map);
        } else {

            map[currChar - 'a'] = true;
            duplicate(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        duplicate(str, 0, new StringBuilder(" "), new boolean[26]);

    }
}
