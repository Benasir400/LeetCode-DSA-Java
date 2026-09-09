class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int l=Integer.MAX_VALUE;
        int le=0;
        for(int r=0;r<nums.length;r++)
        {
           sum+=nums[r];
           while(sum>=target)
           {
              l=Math.min(l,r-le+1);
              sum-=nums[le];
              le++;
           }
        }
        return l==Integer.MAX_VALUE ? 0 : l;
    }
}