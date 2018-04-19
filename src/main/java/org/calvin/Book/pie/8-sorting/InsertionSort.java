import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] data) {
        int n = data.length;
        int tmp;
        int j;
        for (int i = 1; i < n; i++) {
            tmp = data[i];
            for (j = i; j > 0 && data[j-1] > tmp; j--) {
                data[j] = data[j-1];
            }
            data[j] = tmp;
        }
    }

    public static void main(String[] args) {
        InsertionSort sol = new InsertionSort();

        int[] data = {
            6, 5, 2, 7, 1, 4, 8, 9, 3
        };
        
        System.out.println("==== before sort ====");
        System.out.println(Arrays.toString(data));
        
        System.out.println("==== after sort ====");
        sol.insertionSort(data);
        System.out.println(Arrays.toString(data));
    }
}

