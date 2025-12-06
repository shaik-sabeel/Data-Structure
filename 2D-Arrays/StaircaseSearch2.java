
public class StaircaseSearch2 {
    public static boolean staircaseHW(int arr[][], int key){
        int row = arr.length-1;
        int col = 0;

        while(row >= 0 && col < arr[0].length){
            if(arr[row][col] == key){
                System.out.println("Key element found at : " + "(" + row + "," + col + ")");
                return true;
            }
            else if(key < arr[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         int matrix[][] = {
                    {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}
        };

        staircaseHW(matrix, 45);
    }
}
