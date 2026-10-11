class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean v[]=new boolean[n];
        dfs(0,rooms,v);
        for(boolean f:v)
        {
            if(f!=true)
            {
                return false;
            }
        }
        return true;
    }
    public void dfs(int s,List<List<Integer>> rooms,boolean[] v)
    {
        v[s]=true;
        for(int k:rooms.get(s))
        {
            if(!v[k])
            {
              dfs(k,rooms,v);
            }
        }
    }
}