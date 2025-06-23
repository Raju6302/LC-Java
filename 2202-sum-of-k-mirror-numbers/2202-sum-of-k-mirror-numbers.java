class Solution {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;

        while (count < n) {
            List<Long> palindromes = generateBase10Palindromes(length);
            for (long num : palindromes) {
                if (isPalindrome(Long.toString(num, k))) {
                    sum += num;
                    count++;
                    if (count == n) break;
                }
            }
            length++;
        }

        return sum;
    }

     List<Long> generateBase10Palindromes(int len) {
        List<Long> result = new ArrayList<>();
        int halfLen = (len + 1) / 2;
        long start = (long) Math.pow(10, halfLen - 1);
        long end = (long) Math.pow(10, halfLen);

        for (long i = start; i < end; i++) {
            String firstHalf = Long.toString(i);
            String secondHalf = new StringBuilder(firstHalf.substring(0, len % 2 == 0 ? firstHalf.length() : firstHalf.length() - 1)).reverse().toString();
            result.add(Long.parseLong(firstHalf + secondHalf));
        }

        return result;
    }

     boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
