class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        
        while (word.length() < k) {
            StringBuilder newPart = new StringBuilder();
            for (char c : word.toString().toCharArray()) {
                newPart.append(nextChar(c)); 
            }
            word.append(newPart);
        }
        
        return word.charAt(k - 1);
    }

     char nextChar(char c) {
        return (c == 'z') ? 'a' : (char) (c + 1);
    }
}