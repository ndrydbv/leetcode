class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();
        for (int i = 0, j; i < words.length; i = j) {
            int len = -1;
            for (j = i; j < words.length && len + 1 + words[j].length() <= maxWidth; j++) {
                len += (1 + words[j].length());
            }

            StringBuilder line = new StringBuilder();
            line.append(words[i]);
            int spaces = 1;
            int extra = 0;
            if (j != i + 1 && j < words.length) {
                int totalSpaces = maxWidth - len;
                int intervals = j - i - 1;
                spaces = totalSpaces / intervals + 1;
                extra = totalSpaces % intervals;
            }
            for (int k = i + 1; k < j; k++) {
                for (int s = spaces; s > 0; s--)
                    line.append(" ");
                if (extra > 0)
                    line.append(" ");
                extra--;
                line.append(words[k]);
            }
            for (int r = maxWidth - line.length(); r > 0; r--) {
                line.append(" ");
            }
            lines.add(line.toString());
        }
        return lines;
    }
}
