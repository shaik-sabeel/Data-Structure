public class SubArrays {

    public static void subarray(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        subarray(arr);
    }

}
