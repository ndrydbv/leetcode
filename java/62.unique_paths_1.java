class Solution {

    public int uniquePaths(int m, int n) {
        int k = m > n ? n : m;
        int N = m + n - 2;
        double res = 1;
        for (int i = 1; i < k; i++) {
            res *= N--;
            res /= i;
        }
        return (int) res;
    }
}
