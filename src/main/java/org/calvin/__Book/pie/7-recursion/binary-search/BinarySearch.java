public class BinarySearch {

    int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // not found
        }
        int mid = (right - left) / 2 + left; // avoid overflow
        if (array[mid] < target) {
            return binarySearchRecursive(array, target, mid + 1, right);
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, target, left, right - 1);
        } else {
            return mid;
        }
    }

    int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1; // length - 1
        int mid;
        while (left <= right) {
            mid = (right - left) / 2 + left; // avoid overflow
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();

        int[] array = {1, 3, 5, 7, 8, 10, 12};
        int[] targets = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13};
        int[] results = {-1, 0, -1, 1, -1, 2, -1, 3, 4, -1, 5, -1, 6, -1};
        
        int len = array.length;
        int count = targets.length;
        int failed = 0;
        int result;

        System.out.println("==== Binary Search Recursive ====");
        for (int i = 0; i < count; i++) {
            result = sol.binarySearchRecursive(array, targets[i], 0, len-1);
            if (result != results[i]) {
                failed++;
                System.out.println("Target: " + targets[i] + ", expect result: " + results[i] + ", while returned: " + result);
            }
        }
        System.out.println("Test " + count + " cases: " + (count-failed) + " success, " + failed + " failed.");

        System.out.println("==== Binary Search Iterative ====");
        for (int i = 0; i < count; i++) {
            result = sol.binarySearch(array, targets[i]);
            if (result != results[i]) {
                failed++;
                System.out.println("Target: " + targets[i] + ", expect result: " + results[i] + ", while returned: " + result);
            }
        }
        System.out.println("Test " + count + " cases: " + (count-failed) + " success, " + failed + " failed.");

    }

}
