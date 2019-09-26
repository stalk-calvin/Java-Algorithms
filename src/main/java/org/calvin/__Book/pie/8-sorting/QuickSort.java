import java.util.Arrays;

public class QuickSort {
    public void quicksort(int[] data) {
        quicksort(data, 0, data.length - 1);
    }

    private void quicksort(int[] data, int low, int high) {
        if (high <= low) return;
        int pivot = partion(data, low, high);
        quicksort(data, low, pivot - 1);
        quicksort(data, pivot + 1, high);
    }

    private int partion(int[] data, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (data[++i] < data[low])
                if (i == high) break;

            while (data[low] < data[--j])
                if (j == low) break;

            if (i >= j) break;

            swap(data, i, j);
        }
        swap(data, low, j);
        return j; // return index of item now known to be in place
    }

    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort sol = new QuickSort();

        int[] data = {
            6, 5, 2, 7, 1, 4, 8, 9, 3
        };
        System.out.println("==== before sort ====");
        System.out.println(Arrays.toString(data));
        System.out.println("==== after sort ====");
        sol.quicksort(data);
        System.out.println(Arrays.toString(data));
    }
}
