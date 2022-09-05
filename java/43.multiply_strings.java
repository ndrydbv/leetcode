class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null)
            return "";
        if ("0".equals(num1) || "0".equals(num2))
            return "0";

        int m = num1.length(), n = num2.length();
        int[] product = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                int mul = x * y;
                product[i + j + 1] += mul;
                product[i + j] += product[i + j + 1] / 10;
                product[i + j + 1] %= 10;
            }
        }

        final StringBuilder res = new StringBuilder();
        for (int p : product) {
            if (p != 0 || res.length() != 0)
                res.append(p);
        }
        return res.toString();
    }
}
