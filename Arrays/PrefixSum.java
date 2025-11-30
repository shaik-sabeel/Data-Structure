import java.util.*;

public class PrefixSum {

    public static void prefix(int numbers[]) {
        int currSum = 0;
        int arr[] = new int[numbers.length];
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            currSum += numbers[i];
            arr[i] = currSum;
        }

        //Prefix Array


        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        //Maxvalue from prefix array
        

         for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                currSum = i == 0 ? arr[j] : arr[j] - arr[i-1];

                if(maxVal < currSum){
                    maxVal = currSum;
                }
            }
        }
        System.out.println(maxVal);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        prefix(arr);
    }
}
