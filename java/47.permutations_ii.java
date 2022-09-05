import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0)
            return Collections.emptyList();
        final List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, res);
        return res;
    }

    private void dfs(int[] nums, int i, List<List<Integer>> res) {
        System.out.println(Arrays.toString(nums));
        if (i == nums.length) {
            final List<Integer> row = new ArrayList<>(nums.length);
            for (int a : nums)
                row.add(a);
            res.add(row);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            boolean skip = false;
            for (int k = i; k < j; k++) {
                if (nums[k] == nums[j]) {
                    skip = true;
                    break;
                }
            }
            if (skip)
                continue;
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
