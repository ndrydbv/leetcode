// class Solution {
//     public int climbStairs(int n) {
//         int memo[] = new int[n + 1];
//         return climb(0, n, memo);
//     }

//     public int climb(int i, int n, int memo[]) {
//         if (i > n)
//             return 0;
//         if (i == n)
//             return 1;
//         if (memo[i] > 0)
//             return memo[i];
//         memo[i] = climb(i + 1, n, memo) + climb(i + 2, n, memo);
//         return memo[i];
//     }
// }

class Solution {
    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) (fibn / sqrt5);
    }
}
