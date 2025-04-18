class Solution {
    public String countAndSay(int n) {
        String s = "1";
        while (--n > 0) {
            StringBuilder re = new StringBuilder();
            for (int i = 0; i < s.length();) {
                int j = i;
                while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                    j++;
                }
                re.append((j - i) + "");
                re.append(s.charAt(i));
                i = j; 
            }
            s = re.toString();
        }
        return s;
    }
}