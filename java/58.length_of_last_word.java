class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.indexOf(' ') == -1)
            return s.length();
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                return len - 1 - i;
        }
        return 0;
    }
}
