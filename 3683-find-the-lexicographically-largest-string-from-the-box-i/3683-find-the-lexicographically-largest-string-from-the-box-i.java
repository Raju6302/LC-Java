class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) return word;

        int n = word.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            int k = Math.min(n - i, n - numFriends + 1);
            String t = word.substring(i, i + k);
            if (res.compareTo(t) < 0) {
                res = t;
            }
        }
        return res;
    }
}