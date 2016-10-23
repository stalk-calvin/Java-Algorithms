import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> checker = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!checker.add(nums[i])) return true;
        }
        return false;
    }
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
        	return true;
        }
        return false;
    }
}
