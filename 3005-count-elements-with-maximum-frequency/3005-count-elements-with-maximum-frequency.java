class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for (int num : nums) {
            int freq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                count += freq;
            }
        }

        return count;
    }
}
  