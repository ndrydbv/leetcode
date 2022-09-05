class Solution {
    public List<List<Integer>> permute(int[] nums) {
        final List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, res);
        return res;
    }

    private void dfs(int[] nums, int i, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> row = new ArrayList<>();
            for (int a : nums)
                row.add(a);
            res.add(row);
            return;
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            dfs(nums, i + 1, res);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j)
            return;
        nums[i] = nums[j] - nums[i];
        nums[j] = nums[j] - nums[i];
        nums[i] = nums[j] + nums[i];
    }
}
