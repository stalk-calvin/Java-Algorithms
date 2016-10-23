public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mark = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mark.add(nums[i])) {
                return true;
            }
            if (i >= k) {
                //remove first element;
                mark.remove(nums[i - k]);
            }
        }
        return false;
    }
}
