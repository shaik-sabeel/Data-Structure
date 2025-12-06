import java.util.*;

public class practice {

    public static void check(int num[]) {
        int curr = 0;
        while(curr < 0 || curr >= num.length )
            if(num[curr] != 0){
                curr++;
            }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3};
        check(arr);
        
    }
}
