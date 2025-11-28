import java.util.*;

public class LinearSearch {
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
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("key element found at index :" + i);
            }
            else{
                System.out.println("Not found");
            }
        }

    }
}
