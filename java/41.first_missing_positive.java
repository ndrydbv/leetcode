class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            while (nums[i] <= len && nums[i] > 0 && nums[num - 1] != num) {
                nums[i] = nums[num - 1];
                nums[num - 1] = num;
                num = nums[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return len + 1;
    }
}
