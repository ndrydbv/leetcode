class Solution {
    public int[][] generateMatrix(int n) {
        if (n <= 0)
            return new int[0][0];
        int[][] res = new int[n][n];
        int num = 1;
        int lvl = 0;
        while (2 * lvl < n) {
            for (int i = lvl; i < n - lvl; i++)
                res[lvl][i] = num++;
            for (int i = lvl + 1; i < n - lvl; i++)
                res[i][n - lvl - 1] = num++;
            for (int i = n - lvl - 2; i >= lvl; i--)
                res[n - lvl - 1][i] = num++;
            for (int i = n - lvl - 2; i >= lvl + 1; i--)
                res[i][lvl] = num++;
            lvl++;
        }
        return res;
    }
}
