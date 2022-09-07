class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = 1 + digits[i];
            if (digits[i] == 10)
                digits[i] = 0;
            else
                return digits;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        for (int i = 0; i < digits.length; i++)
            ans[i + 1] = digits[i];
        return ans;
    }
}
