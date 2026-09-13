class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        return ans;
    }
    private void backtrack(int index,int nums[],List<Integer> cur)
    {
        ans.add(new ArrayList<>(cur));
        for(int i=index;i<nums.length;i++)
        {
            cur.add(nums[i]);
            backtrack(i+1,nums,cur);
            cur.remove(cur.size()-1);
        }
    }
}