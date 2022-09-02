import java.util.ArrayList;

class Solution {
    private static final String[] LETTERS = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }
        final List<String> res = new ArrayList<>();
        backtrack(digits, 0, "", res);
        return res;
    }

    private void backtrack(String digits, int start, String letters, List<String> res) {
        if (start == digits.length()) {
            res.add(letters);
            return;
        }

        String current = LETTERS[digits.charAt(start) - '0'];
        for (char c : current.toCharArray()) {
            backtrack(digits, start + 1, letters + c, res);
        }
    }
}
