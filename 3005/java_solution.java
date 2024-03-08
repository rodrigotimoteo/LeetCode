import java.util.HashMap;

class Solution3005 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxFrequency = 0;

        for(int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
            maxFrequency = Math.max(maxFrequency, hashMap.get(nums[i]));
        }

        int countMaxOccurencies = 0;

        for(int frequency : hashMap.values()) {
            if(frequency == maxFrequency) countMaxOccurencies += frequency;
        }

        return countMaxOccurencies;
    }
}