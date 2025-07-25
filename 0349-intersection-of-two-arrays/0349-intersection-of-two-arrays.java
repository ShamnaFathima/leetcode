public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();  // store elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();  // to store intersection (no duplicates)
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);  // only add if it's in nums1
            }
        }

        // Convert Set to int[]
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
