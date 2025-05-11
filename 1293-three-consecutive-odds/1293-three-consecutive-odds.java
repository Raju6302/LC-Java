class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (count < 3 && arr[i] % 2 == 0) {
                count = 0;
            } else if ( count == 3) {
                return true;
            } else if ( arr[i] == 1 || arr[i] % 2 != 0 ) {
                count++;
            }
 
        }
        return count == 3 ? true : false;
    }
}