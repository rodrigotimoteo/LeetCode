import java.util.Arrays;

class Solution1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int max = 0;

        for(int i = 0, l = nums.length - 1; i < nums.length / 2; i++, l--) 
            if(nums[i] + nums[l] > max) max = nums[i] + nums[l];
        
        return max;
    }
}