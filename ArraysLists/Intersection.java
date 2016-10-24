import java.util.*;
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (nums1Set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] r = new int[result.size()];
        int index = 0;
        for (Integer i : result) {
            r[index++] = i; // auto unbox
        }
        return r;
    }
}
