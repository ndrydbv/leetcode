class Solution {
    public String getPermutation(int n, int k) {
        k = k - 1;
        int factor = 1;
        for (int i = 1; i < n; i++)
            factor *= i;
        List<Integer> digits = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            digits.add(i + 1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int idx = k / factor;
            sb.append(digits.get(idx));
            digits.remove(idx);
            k = k % factor;
            if (i < n - 1)
                factor /= n - 1 - i;
        }
        return sb.toString();
    }
}
