
import java.util.*;

public class swap {

    public static void swapNum(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx2);
        list.set(idx2, list.get(idx1));
        list.set(idx1, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(1);

        int idx1 = 3, idx2 = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        swapNum(list, idx1, idx2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
