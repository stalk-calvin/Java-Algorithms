public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) return nums;
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tracker.get(target - nums[i]) != null) {
                int[] result = new int[2];
                result[0] = i;
                result[1] = tracker.get(target - nums[i]);
                return result;
            }
            tracker.put(nums[i], i);
        }
        return new int[2];
    }
}
