import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        // int[] count = new int[26];
        // for (String s : strs) {
        // ys.fill(count, 0);
        // (char c : s.toCharArray())
        // - 'a']++;

        // ngBuilder sb = new StringBuilder("");
        // (int i = 0; i < 26; i++) {
        // d('#');
        // d(count[i]);
        //
        // ng key = sb.toString();
        // !ans.containsKey(key))
        // key, new ArrayList());
        // get(key).add(s);
        // }
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key))

                ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());

    }
}
