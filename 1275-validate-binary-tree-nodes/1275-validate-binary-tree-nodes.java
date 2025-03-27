class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] inDegree = new int[n];

        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                inDegree[leftChild[i]]++;
            }
            if (rightChild[i] != -1) {
                inDegree[rightChild[i]]++;
            }
        }

        int root = -1;
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                if (root == -1) {
                    root = i; 
                } else {
                    return false;
                }
            }
        }

        if (root == -1) return false;

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited.add(node)) {
                return false;
            }

            if (leftChild[node] != -1) queue.add(leftChild[node]);
            if (rightChild[node] != -1) queue.add(rightChild[node]);
        }

        return visited.size() == n; 
    }
}