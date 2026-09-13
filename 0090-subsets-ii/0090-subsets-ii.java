class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>());
        return ans;
    }
    private void backtrack(int s,int nums[],List<Integer> cur)
    {
        ans.add(new ArrayList<>(cur));
        for(int i=s;i<nums.length;i++)
        {
            if(s<i && nums[i]==nums[i-1])
            {
                continue;
            }
            cur.add(nums[i]);
            backtrack(i+1,nums,cur);
            cur.remove(cur.size()-1);
        }
    }
}