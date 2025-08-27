class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] ugly = new int[n];
        int[] index = new int[k];
        long[] value = new long[k];  

        ugly[0] = 1;
        Arrays.fill(value, 1);

        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                value[j] = (long) primes[j] * ugly[index[j]];
                next = Math.min(next, value[j]);
            }
            ugly[i] = (int) next;  
            for (int j = 0; j < k; j++) {
                if (value[j] == next) {
                    index[j]++;
                }
            }
        }
        return ugly[n - 1];
    }
}
