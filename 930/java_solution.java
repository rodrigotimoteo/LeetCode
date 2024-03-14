class Solution930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == goal) result++;

            for(int j = i + 1; j < nums.length; j++) {
                sum += nums[j];

                if(sum == goal) result++;
                else if(sum > goal) break;
            }

            sum = 0;
        }

        return result;
    }
}