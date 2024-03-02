import java.util.HashMap;
import java.util.Map;

class Solution169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count;

        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) { 
              count = map.get(nums[i]) + 1; 
              map.put(nums[i], count); 
            } 
            else 
                map.put(nums[i], 1);  
            if(map.get(nums[i]) > nums.length / 2) 
                return nums[i]; 
        }

        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }

        return maxValue;
    }
}