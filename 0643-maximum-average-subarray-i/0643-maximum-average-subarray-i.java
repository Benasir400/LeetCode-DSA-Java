class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
          sum+=nums[i];
        }
        double maxs=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i];
            sum-=nums[i-k];
            maxs=Math.max(maxs,sum);
        }
      return maxs/k;
    }
}