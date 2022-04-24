package array;

public class Solution {

    /**
     * 双指针解法
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }

    public boolean containsDuplicate(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
              
        }
        return false;
    }
}
