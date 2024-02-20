import java.util.ArrayList;
import java.util.List;

class Solution2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        boolean working = true;
        int added = 0;
        int rows = 0;

        List<List<Integer>> list = new ArrayList<>();

        while(working) {
            list.add(new ArrayList<Integer>());

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == -1) continue;

                if(!list.get(rows).contains(nums[i])) {
                    list.get(rows).add(nums[i]);
                    nums[i] = -1;

                    added++;
                }
            }

            if(added == nums.length) working = false;
            rows++;
        }

        return list;
    }
}