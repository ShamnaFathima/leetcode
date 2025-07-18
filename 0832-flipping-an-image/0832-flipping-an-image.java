class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            int left = 0, right = row.length - 1;

            while (left <= right) {
                // Flip and invert in one step
                int temp = row[left] ^ 1;
                row[left] = row[right] ^ 1;
                row[right] = temp;

                left++;
                right--;
            }
        }

        return image;
    }
}
