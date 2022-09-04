import java.util.ArrayList;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0)
            return Collections.emptyList();

        final List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] candidates, int target, int pos, List<Integer> comb, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(comb));
            return;
        }

        for (int i = pos; i < candidates.length; i++) {
            int newTarget = target - candidates[i];
            if (newTarget >= 0) {
                comb.add(candidates[i]);
                dfs(candidates, newTarget, i + 1, comb, res);
                comb.remove(comb.size() - 1);
            } else
                break;
            while (i < candidates.length - 1 && candidates[i] == candidates[i + 1])
                i++;

        }
    }
}
