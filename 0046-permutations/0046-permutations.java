class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    boolean v[];
    public List<List<Integer>> permute(int[] nums) {
        v=new boolean[nums.length];
        backtrack(v,nums,new ArrayList<>());
        return ans;
    }
    private void backtrack(boolean v[],int nums[],List<Integer>cur)
    {
       if(cur.size()==nums.length) 
       {
         ans.add(new ArrayList<>(cur));
         return;
       }
       for(int i=0;i<nums.length;i++)
       {
         if(v[i])
         {
            continue;
         }
         v[i]=true;
         cur.add(nums[i]);
         backtrack(v,nums,cur);
         cur.remove(cur.size()-1);
         v[i]=false;
       }
    }

}