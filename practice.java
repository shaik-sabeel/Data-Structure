import java.util.*;

public class practice {
    public static void duplicate(int arr[]){

        int idx = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[idx] == arr[i]){
                arr[idx] = arr[i];
            }
            else{
                idx++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 4, 5};
        duplicate(arr);

    }
}
