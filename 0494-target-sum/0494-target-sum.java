public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int num : nums) total += num;
        if ((total + target) % 2 != 0 || total < Math.abs(target)) return 0;
        int subsetSum = (total + target) / 2;
        return countSubsets(nums, subsetSum);
    }
    public int countSubsets(int[] nums, int sum) {
        int[] ts = new int[sum + 1];
        ts [0] = 1;

        for (int num : nums) {
            for (int i = sum; i >= num; i--) {
                ts [i] += ts[i - num];
            }
        }

        return ts[sum];
    }
}
