public class HouseRobber {
    public int rob(int[] nums) {
        int L = nums.length;
        if(L == 0){
            return 0;
        }
        if(L==1){
            return nums[0];
        }
        if(L == 2)
        {
            return Math.max(nums[0],nums[1]);
        }
        if(L==3){
            return Math.max(nums[0]+nums[2],nums[1]);
        }
        int[] m = new int[L];
        m[0] = nums[0];
        m[1] = Math.max(nums[0],nums[1]);
        m[2] =Math.max(nums[0]+nums[2],nums[1]);
        for(int i = 3;i<L;i++){
            m[i] = Math.max(nums[i] + m[i-2],nums[i-1] + m[i-3]);
        }
        return m[L -1];
    }
}
