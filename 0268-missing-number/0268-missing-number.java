class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }
        int numsum=0;
        for(int i=0;i<nums.length;i++)
        {
            numsum+=nums[i];
        }
        int sumtotal=sum-numsum;
        return sumtotal;
        
    }
}