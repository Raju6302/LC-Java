class Solution {
    public String robotWithString(String s) {
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            ++count[c - 'a'];
        }

        StringBuilder ans = new StringBuilder();
        Deque<Character> stk =  new ArrayDeque<>();
        char  mi =  'a';
        
        for (char c : s.toCharArray()) {
            --count[c - 'a'];
            while (mi < 'z'  && count[mi - 'a'] ==  0) {
                mi++;
            }

            stk.push(c);
            while(!stk.isEmpty() && stk.peek() <= mi) {
                ans.append(stk.pop());
            }
        }

        return ans.toString();
    }
}