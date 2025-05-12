class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int[] nums) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (path.contains(num)) continue;
            path.add(num);
            backtrack(result, path, nums);
            path.remove(path.size() - 1);
        }
    }
}
