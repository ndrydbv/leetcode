class Solution {
    public int mySqrt(int x) {
        int res = 0;
        for (int mask = 1 << 15; mask != 0; mask = mask >> 1) {
            int cand = res | mask;
            if (cand <= x / cand)
                res = cand;
        }
        return res;
    }
}
