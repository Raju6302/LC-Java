class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int n = s.length();
        int length = 0;
        while (right < n) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }

            map.put(s.charAt(right), right);
            length = Math.max(length, right - left + 1);
            right++;
        }
        return length;
    }
}