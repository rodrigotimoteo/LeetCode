class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid = 0;

        if(target > nums[high]) return nums.length;
        if(target < nums[low]) return 0;

        while(low < high) {
            mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;

            if(nums[mid] > target) high = mid;
            else             low = mid + 1;
        }

        return low;
    }
}