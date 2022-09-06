class Solution {

    public int totalNQueens(int n) {
        return dfs(0, n, 0, 0, 0);
    }

    public int dfs(int x, int n, int c, int d, int ad) {
        if (x == n)
            return 1;
        int res = 0;
        for (int y = 0; y < n; y++) {
            if ((c & (1 << y)) == 0 && (d & (1 << (x + y))) == 0 && (ad & (1 << (x - y + n - 1))) == 0) {
                res += dfs(x + 1, n, c | (1 << y), d | (1 << (x + y)), ad | (1 << (x - y + n - 1)));
            }
        }
        return res;
    }
}
