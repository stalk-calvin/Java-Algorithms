import java.util.Arrays;

public class SelectionSort {

    public void selectionSortRecursive(int[] data) {
        selectionSortRecursive(data, 0);
    }

    private void selectionSortRecursive(int[] data, int start) {
        if (start < data.length - 1) {
            swap(data, start, findMinimumIndex(data, start));
            selectionSortRecursive(data, start+1);
        }
    }

    private int findMinimumIndex(int[] data, int start) {
        int minPos = start;
        for (int i = start +1; i < data.length; i++) {
            if (data[i] < data[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    private void swap(int[] data, int idx1, int idx2) {
        if (idx1 != idx2) {
            int tmp = data[idx1];
            data[idx1] = data[idx2];
            data[idx2] = tmp;
        }
    }

    public static void main(String[] args) {
        SelectionSort sol = new SelectionSort();
        int[] data = {
            6, 5, 2, 7, 1, 4, 8, 9, 3
        };
        System.out.println("==== before sort ====");
        System.out.println(Arrays.toString(data));
        System.out.println("==== after sort ====");
        sol.selectionSortRecursive(data);
        System.out.println(Arrays.toString(data));
    }
}
