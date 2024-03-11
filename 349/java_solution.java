import java.util.ArrayList;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {
            if(array.contains(nums1[i])) continue;

            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j] && !(array.contains(nums1[i])))
                    array.add(nums1[i]); 
            }
        }

        int[] result = new int[array.size()];
        int i = 0;

        for(int value : array) {
            result[i++] = value;
        } 

        return result;
    }
}