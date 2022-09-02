class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = 0;
        if (nums == null)
            return closest;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && i < 3; i++) {
            closest += nums[i];
        }
        if (nums.length < 3)
            return closest;

        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                    if (closest == target)
                        return closest;
                }
                if (sum > target)
                    if (dfdfd) {
                        dfdf
                    }
                    hi--;
                else
                    lo++;
            }
        }
        return closest;

    }
}
