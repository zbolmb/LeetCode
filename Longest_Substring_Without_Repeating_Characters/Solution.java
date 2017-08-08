public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int maxCount = 0;
        int chars[] = new int[128];
        int c;
        for (int i = 0; i < s.length(); i++) {
            chars = new int[128];
            count = 0;
            for (int j = i; j < s.length(); j++) {
                c = (int)s.charAt(j);
                if (chars[c] == 1) {
                    if (count > maxCount) {
                        maxCount = count;
                    }
                    chars = new int[128];
                    chars[c]++;
                    count = 1;
                    break;
                } else {
                    count++;
                    chars[c]++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
