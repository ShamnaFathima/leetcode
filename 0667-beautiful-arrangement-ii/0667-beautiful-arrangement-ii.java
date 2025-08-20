public class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int left = 1, right = n;
        int index = 0;
        while (k > 0) {
            if (k % 2 == 1) {
                res[index++] = left++;
            } else {
                res[index++] = right--;
            }
            k--;
        }
        while (left <= right) {
            res[index++] = left++;
        }

        return res;
    }
}
