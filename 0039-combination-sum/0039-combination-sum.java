class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0,candidates,target,new ArrayList<>());
        return ans;
    }
    public void solve(int s,int candidates[],int target,List<Integer> res)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=s;i<candidates.length;i++)
        {
            res.add(candidates[i]);
            solve(i,candidates,target-candidates[i],res);
            res.remove(res.size()-1);
        }
    }
}