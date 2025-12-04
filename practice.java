import java.util.*;

public class practice {

    public static void check(int num1[], int num2[]) {
        
        Arrays.sort(num1); // ensure sorted
        Arrays.sort(num2); // ensure sorted

        int m = num1.length - 1;
        int n = num2.length - 1;
        int k = num1.length + num2.length - 1;

        int arr[] = new int[k + 1];

        while (m >= 0 && n >= 0) {
            if (num1[m] > num2[n]) {
                arr[k] = num1[m];
                m--;
            } else {
                arr[k] = num2[n];
                n--;
            }
            k--;
        }

        while (n >= 0) {
            arr[k] = num2[n];
            n--;
            k--;
        }

        while (m >= 0) {
            arr[k] = num1[m];
            m--;
            k--;
        }

        int l = arr.length;

        if(l % 2 == 0){
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 6};
        int arr1[] = {3, 5, 2};

        check(arr, arr1);
    }
}
