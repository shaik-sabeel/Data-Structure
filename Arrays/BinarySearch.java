import java.util.*;

public class BinarySearch {
    public static int binary(int array[], int key){
        int start = 0;
        int end = array.length - 1;
        

        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] < key){
                start = mid + 1;
            }

            else{
                end = mid -1;
            }
        }
        return -1;
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

        int key = 10;

        System.out.println("Key found at index : " + binary(arr, key));
    }

}



    