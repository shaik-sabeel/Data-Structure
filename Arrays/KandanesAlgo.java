import java.util.*;

public class KandanesAlgo {

    public static void kandanes(int numbers[]){
        int currSum = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                currSum = 0; 
                for(int k = i; k <= j; k++){

                    currSum += numbers[k];

                    if(currSum <= 0){
                        currSum = 0;
                    }
                } 
                if(maxVal < currSum){
                    maxVal = currSum;
                }              
            }
        }
        System.out.println(maxVal);
    }

    public static void kadanes(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i < number.length; i++){
            cs += number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kandanes(arr);
        kadanes(arr);
    }
}
