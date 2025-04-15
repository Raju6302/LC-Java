class Solution {
    class FenwickTree {
        int[] tree;
        int size;
        public FenwickTree(int size) {
            this.size = size;
            tree = new int[size + 2];
        }
        void update(int index, int delta) {
            index++;
            while (index <= size + 1) {
                tree[index] += delta;
                index += index & -index;
            }
        }
        int query(int index) {
            index++;
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & -index;
            }
            return sum;
        }
        int rangeQuery(int left, int right) {
            return query(right) - query(left - 1);
        }
    }
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] posInNums2 = new int[n];
        for (int i = 0; i < n; i++) {
            posInNums2[nums2[i]] = i;
        }

        int[] transformed = new int[n];
        for (int i = 0; i < n; i++) {
            transformed[i] = posInNums2[nums1[i]];
        }

        FenwickTree leftTree = new FenwickTree(n);
        FenwickTree rightTree = new FenwickTree(n);
        for (int x : transformed) {
            rightTree.update(x, 1); // Initially, all elements are in right tree
        }

        long count = 0;
        for (int i = 0; i < n; i++) {
            int curr = transformed[i];
            rightTree.update(curr, -1); // Move curr from right to current
            int leftCount = leftTree.query(curr - 1); // smaller than curr on left
            int rightCount = rightTree.rangeQuery(curr + 1, n); // greater than curr on right
            count += (long) leftCount * rightCount;
            leftTree.update(curr, 1); // Add curr to left
        }
        return count;
    }
}