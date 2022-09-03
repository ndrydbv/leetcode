class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        final List<Integer> res = new ArrayList<>();
        if (s == null || words == null || words.length == 0)
            return res;
        int len = words[0].length();
        final Map<String, Integer> map = new HashMap<>();
        for (String w : words)
            map.put(w, map.containsKey(w) ? map.get(w) + 1 : 1);
        for (int i = 0; i <= s.length() - len * words.length; i++) {
            final Map<String, Integer> copy = new HashMap<>(map);
            for (int j = 0; j < words.length; j++) {
                String str = s.substring(i + j * len, i + j * len + len);
                if (copy.containsKey(str)) {
                    int count = copy.get(str);
                    if (count == 1)
                        copy.remove(str);
                    else
                        copy.put(str, count - 1);
                    if (copy.isEmpty()) {
                        res.add(i);
                        break;
                    }
                } else
                    break;
            }
        }
        return res;

    }
}
