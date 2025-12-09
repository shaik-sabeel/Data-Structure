import java.util.*;

public class Palindrome {
    public static void Palindrome(String str){
        int l = str.length();
        for(int i = 0; i < l/2; i++){
            if(str.charAt(i) == str.charAt(l-i-1)){
                ;
            }
        }
    }

    public static void main(String args[]){
        String str = "racecar";
        Palindrome(str);
    }
}
