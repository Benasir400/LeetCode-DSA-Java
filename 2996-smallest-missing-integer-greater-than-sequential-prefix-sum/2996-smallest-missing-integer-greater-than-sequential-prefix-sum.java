class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==nums[i-1]+1)
           {
              sum+=nums[i];
           }
           else
           {
              break;
           }
        }
        HashSet<Integer> m=new HashSet<>();
        for(int k:nums)
        {
            m.add(k);
        }
        while(m.contains(sum))
        {
            sum++;
        }
        return sum;
    }
}