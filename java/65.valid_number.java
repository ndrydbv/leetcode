class Solution {
    public boolean isNumber(String s) {
        boolean hasDot = false;
        boolean hasExp = false;
        boolean hasNum = false;
        char[] num = s.toCharArray();
        for (int i = 0; i < num.length; i++) {
            if ('0' <= num[i] && num[i] <= '9')
                hasNum = true;
            else if (num[i] == '.') {
                if (hasExp || hasDot)
                    return false;
                hasDot = true;
            } else if (num[i] == 'e' || num[i] == 'E') {
                if (hasExp || !hasNum)
                    return false;
                hasNum = false; // avoid 1e
                hasExp = true;
            } else if (num[i] == '-' || num[i] == '+') {
                if (i != 0 && num[i - 1] != 'e' && num[i - 1] != 'E')
                    return false;
            } else
                return false;
        }
        return hasNum;
    }
}
