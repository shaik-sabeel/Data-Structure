public class CountSort {
    public static void count(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(arr[i], largest);
        }

        //frequency of the elements in the original array

        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        //Sorting of the original aaray by using the frequency of the elements stored in the count array

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;

            }
        }

       System.out.println("after Sorted Array :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        } 

}
    public static void main(String[] args){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        int n = arr.length;

        System.out.println("Before Sorted Array :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        count(arr);

    }
}
