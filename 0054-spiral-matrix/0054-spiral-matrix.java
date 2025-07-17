class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sOrder = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0, right = n - 1, bottom = m -1;

        while (top <= bottom && left <= right) {

            //traverse from left to right
            for (int i = left; i <= right; i++) {
                sOrder.add(matrix[top][i]);
            }
            top++;

            //traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                sOrder.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                //traverse from right to left
                for (int i = right; i >= left; i--) {
                    sOrder.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                //traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    sOrder.add(matrix[i][left]);
                }
                left++;
            }
            
        }

        return sOrder;
    }
}