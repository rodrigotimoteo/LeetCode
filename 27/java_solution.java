class Solution27 {
    public int removeElement(int[] nums, int val) {
        int removed = 0;
        int currentRemoved = nums.length - 1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                if(currentRemoved == i) {removed++; break;}

                changeValue(nums, i--, currentRemoved--);
                removed++;

                continue;
            }

            if(currentRemoved == i) break;
        }

        return nums.length - removed;
    }

    private void changeValue(int[] nums, int from, int to) {
        int valueFrom = nums[from];
        int valueTo = nums[to];
        nums[from] = valueTo;
        nums[to] = valueFrom;
    }
}