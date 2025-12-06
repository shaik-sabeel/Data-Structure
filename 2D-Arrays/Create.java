import java.util.*;

public class Create {

    public static boolean searchVal(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Hey found at index" + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void maxMin(int arr[][]){
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > maxVal){
                    maxVal = arr[i][j];
                }

                if(arr[i][j] < minVal){
                    minVal = arr[i][j];
                }
            }
        }

        System.out.println(minVal + "," + maxVal);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchVal(matrix, 8);
        maxMin(matrix);

    }

    
}
