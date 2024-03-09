class Solution2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        if(nums1[nums1.length - 1] < nums2[0]) return -1;

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) return nums1[i];
            }
        }

        return -1;
    }
}