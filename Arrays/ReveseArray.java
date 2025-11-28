import java.util.*;
public class ReveseArray {

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        

        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }

       

    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 6, 7, 3};

        reverse(arr);
         for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
