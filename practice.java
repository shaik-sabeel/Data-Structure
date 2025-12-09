public class Practice {

    public static void subarray(int nums[]){
        int n = (nums.length * 2) - 1;
    
        int arr[] = new int[n];

        for(int i = 0; i <= n; i++){
            arr[i] = nums[i];
        }
        
        for(int i = 0; i <= n; i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        subarray(arr);
    }

}