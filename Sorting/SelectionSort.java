import java.util.*;

public class SelectionSort {

    public static void selection(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;          
        }

        System.out.println("Sorted Array :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        int n = arr.length;

        System.out.println("Before Sorted Array :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        selection(arr);

    }
}
