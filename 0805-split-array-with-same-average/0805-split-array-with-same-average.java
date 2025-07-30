public class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        Arrays.sort(nums);
        boolean possible = false;
        for (int k = 1; k <= n / 2; k++) {
            if ((totalSum * k) % n == 0) {
                possible = true;
                break;
            }
        }
        if (!possible) return false;

        Set<Integer>[] subsetSumsBySize = new Set[n + 1];
        for (int i = 0; i <= n; i++) {
            subsetSumsBySize[i] = new HashSet<>();
        }
        subsetSumsBySize[0].add(0);

        for (int num : nums) {
            for (int i = n - 1; i >= 0; i--) {
                for (int s : subsetSumsBySize[i]) {
                    subsetSumsBySize[i + 1].add(s + num);
                }
            }
        }
        for (int k = 1; k <= n / 2; k++) {
            if ((totalSum * k) % n == 0) {
                int target = (totalSum * k) / n;
                if (subsetSumsBySize[k].contains(target)) return true;
            }
        }

        return false;
    }
}
