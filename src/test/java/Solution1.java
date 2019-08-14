import java.util.HashMap;
import java.util.Map;

public class Solution1 implements Solution {
    private Map<Integer,Boolean> map = new HashMap<>();

    @Override
    public boolean canJump(int[] nums) {

        return jump(nums, 0);
    }

    private boolean jump(int[] nums, int start) {
        if (!map.containsKey(start)) {
            if (start >= nums.length-1) {
                map.put(nums.length-1, true);
            } else {
                boolean canJump = false;
                for (int i = 1; i <= nums[start]; i++) {
                    canJump |= jump(nums, start + i);
//                    if (canJump) {
//                        break;
//                    }
                }
                map.put(start, canJump);
            }
        }
        return map.get(start >= nums.length-1 ? nums.length-1 : start);
    }
}
