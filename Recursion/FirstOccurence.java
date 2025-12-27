
public class FirstOccurence {

    public static int occur(int arr[], int target, int i) {

        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }

        return occur(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 4, 2, 6};

        System.out.println(occur(arr, 6, 0));
    }
}
