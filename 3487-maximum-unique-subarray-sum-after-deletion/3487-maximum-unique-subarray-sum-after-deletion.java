 public class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        if (max <= 0) {
            return max;
        }
        HashSet<Integer> seen = new HashSet<>();
        int total = 0;

        for (int num : nums) {
            if (num > 0 && !seen.contains(num)) {
                seen.add(num);
                total += num;
            }
        }

        return total;
    }
}
