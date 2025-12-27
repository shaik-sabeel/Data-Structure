
public class LastOccurence {

    public static int lastOccur(int arr[], int target, int i) {

        if (i == 0) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }

        return lastOccur(arr, target, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 4, 2, 6};
        System.out.println(lastOccur(arr, 9, arr.length - 1));
    }
}
