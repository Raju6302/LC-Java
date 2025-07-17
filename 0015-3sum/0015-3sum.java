class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplet = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                    if (hashSet.contains(third)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(third);

                        Collections.sort(temp);
                        triplet.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }

        List<List<Integer>> result = new ArrayList<>(triplet);
        return result;
        
    }
}