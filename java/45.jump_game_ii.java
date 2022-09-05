class Solution {
    public int jump(int[] nums) {
        int res = 0;
        int curMax = 0;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (curMax == i) {
                res++;
                curMax = max;
            }
        }
        return res;

    }
}
