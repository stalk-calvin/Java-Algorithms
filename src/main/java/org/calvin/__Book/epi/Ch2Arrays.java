package org.calvin.terview.epi;

import java.util.Collections;
import java.util.List;

public class Ch2Arrays {
    public void evenOdd(int[] nums) {
        int nextEven = 0, nextOdd = nums.length - 1;
        while (nextEven < nextOdd) {
            if (nums[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = nums[nextEven];
                nums[nextEven] = nums[nextOdd];
                nums[nextOdd--] = temp;
            }
        }
    }

    public enum Color {RED, WHITE, BLUE}

    public void dutchFlagPartition(int pivotIndex, List<Color> A) {
        Color pivot = A.get(pivotIndex);
        // First pass: group elements smaller than pivot.
        for (int i = 0; i < A.size(); ++i) {
            // Look for a smaller element.
            for (int j = i + 1; j < A.size(); ++j) {
                if (A.get(j).ordinal() < pivot.ordinal()) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }
        // Second pass: group elements larger than pivot.
        for (int i = A.size() - 1; i >= 0 && A.get(i).ordinal() >= pivot.ordinal(); --i) {
            // Look for a larger element. Stop when we reach an element less
            // than pivot, since first pass has moved them to the start of A.
            for (int j = i - 1; j >= 0 && A.get(j).ordinal() >= pivot.ordinal(); --j) {
                if (A.get(j).ordinal() > pivot.ordinal()) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }
    }

    public static void dutchFlagPartitionOptimized(int pivotIndex, List<Color> A) {
        Color pivot = A.get(pivotIndex);
        // First pass: group elements smaller than pivot.
        int smaller = 0;
        for (int i = 0; i < A.size(); ++i) {
            if (A.get(i).ordinal() < pivot.ordinal()) {
                Collections.swap(A, smaller++, i);
            }
        }
        // Second pass: group elements larger than pivot.
        int larger = A.size() - 1;
        for (int i = A.size() - 1; i >= 0 && A.get(i).ordinal() >= pivot.ordinal(); --i) {
            if (A.get(i).ordinal() > pivot.ordinal()) {
                Collections.swap(A, larger--, i);
            }
        }
    }
}
