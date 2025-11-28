import java.util.*;

public class LargestValue {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i ++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("array : \n");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("Largest value is : " + getLargest(arr));
    }
}
