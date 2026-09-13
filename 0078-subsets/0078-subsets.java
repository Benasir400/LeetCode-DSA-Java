class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        return ans;
    }
    private void backtrack(int index,int nums[],List<Integer> cur)
    {
        if(index==nums.length)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[index]);
        backtrack(index+1,nums,cur);
        cur.remove(cur.size()-1);
        backtrack(index+1,nums,cur);
    }
}