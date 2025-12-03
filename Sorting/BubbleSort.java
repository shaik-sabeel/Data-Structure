import java.util.*;

public class BubbleSort {

    public static void bubble(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){ //turns
            boolean swap = false;
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;

                }
            }

            if(!swap) break;
        }

        System.out.println("Sorted Array :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Before Sorted Array :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        bubble(arr);

    }
}
