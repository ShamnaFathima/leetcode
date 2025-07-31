public class Solution {
    public int arrayNesting(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                int count = 0;
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    current = nums[current];
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}
