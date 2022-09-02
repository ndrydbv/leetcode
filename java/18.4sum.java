class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4)
            return Collections.emptyList();
        final List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                long newTarget = (long) target - nums[i] - nums[j];
                int lo = j + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    if (lo > j + 1 && nums[lo] == nums[lo - 1]) {
                        lo++;
                        continue;
                    }
                    if (hi < nums.length - 1 && nums[hi] == nums[hi + 1]) {
                        hi--;
                        continue;
                    }
                    int sum = nums[lo] + nums[hi];
                    if (sum < newTarget) {
                        lo++;
                    } else if (sum > newTarget) {
                        hi--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        lo++;
                        hi--;
                    }
                }
            }

        }
        return res;

    }
}
