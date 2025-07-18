class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            current += g;
            if (current > maxAltitude) {
                maxAltitude = current;
            }
        }

        return maxAltitude;
    }
}
