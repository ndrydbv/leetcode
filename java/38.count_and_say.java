class Solution {
    public String countAndSay(int n) {
        String res = "1";
        while (n > 1) {
            StringBuilder s = new StringBuilder();
            for (int i = 0, j = i; i < res.length(); i = j) {
                while (j < res.length() && res.charAt(i) == res.charAt(j))
                    j++;
                s.append(j - i).append(res.charAt(i));
            }
            res = s.toString();
            n--;
        }
        return res;

    }
}
