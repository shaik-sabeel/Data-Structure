import java.util.*;

public class MaxSubArray{
    
    public static void maxSum(int numbers[]){
        int currSum = 0; 
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                currSum = 0;
                for(int k = i; k <= j; k++){

                    currSum += numbers[k];
                }

                System.out.println("Sum of subarrays: " + currSum);

                if(maxVal < currSum){
                    maxVal = currSum;
                }
            }
        }
        System.out.println("Max Sum array :" + maxVal);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        maxSum(numbers);
    }
}