class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            for(int l = i + 1; l < nums.length; l++) {
                if(nums[i] + nums[l] == target) {
                    positions[0] = i;
                    positions[1] = l;
                }
            }
        }
        
        return positions;
    }
}