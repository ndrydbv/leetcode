class Solution {
    public int divide(int d, int di) {
        if (d == Integer.MIN_VALUE && di == -1)
            return Integer.MAX_VALUE;

        long res = 0;

        int sign = (d < 0 && di > 0) || (d > 0 && di < 0) ? -1 : 1;

        long ld = Math.abs((long) d);
        long ldi = Math.abs((long) di);

        while (ld >= ldi) {
            long temp = ldi;
            long count = 1;
            while (temp << 1 <= ld) {
                temp <<= 1;
                count <<= 1;
            }
            res += count;
            ld -= temp;
        }
        return sign * ((int) res);
    }
}
