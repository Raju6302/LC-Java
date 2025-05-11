class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && count < 3) {
                count++;
            } else if ( count == 3) {
                return true;
            } else {
                count = 0;
            }
 
        }
        return count == 3;
    }
}