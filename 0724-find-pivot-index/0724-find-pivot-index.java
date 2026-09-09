class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sum1=0;
            for(int j=0;j<i;j++)
            {
               sum1+=nums[j];
            }
            int sum2=0;
            for(int j=nums.length-1;j>i;j--)
            {
                sum2+=nums[j];
            }
            if(sum1==sum2)
            {
                return i;
            }
        }
        return -1;
    }
}