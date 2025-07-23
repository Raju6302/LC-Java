class Solution {
    public int maximumGain(String s, int x, int y) {
         if (x > y) {
            return gainHelper(s, 'a', 'b', x, y);
        } else {
            return gainHelper(s, 'b', 'a', y, x);
        }
    }
       int gainHelper(String s, char first, char second, int highScore, int lowScore) {
        StringBuilder stack1 = new StringBuilder();
        int total = 0;

        // Step 1: Remove high-scoring pair
        for (char c : s.toCharArray()) {
            if (stack1.length() > 0 && stack1.charAt(stack1.length() - 1) == first && c == second) {
                stack1.deleteCharAt(stack1.length() - 1);
                total += highScore;
            } else {
                stack1.append(c);
            }
        }

        // Step 2: Remove low-scoring pair from remaining string
        StringBuilder stack2 = new StringBuilder();
        for (int i = 0; i < stack1.length(); i++) {
            char c = stack1.charAt(i);
            if (stack2.length() > 0 && stack2.charAt(stack2.length() - 1) == second && c == first) {
                stack2.deleteCharAt(stack2.length() - 1);
                total += lowScore;
            } else {
                stack2.append(c);
            }
        }

        return total;
    }
}