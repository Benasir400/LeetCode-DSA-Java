class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean v[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!v[i])
            {
                dfs(i,v,isConnected);
                c++;
            }
        }
        return c;
    }
    private void dfs(int city,boolean v[],int[][] isConnected)
    {
        v[city]=true;
        for(int ne=0;ne<isConnected.length;ne++)
        {
            if(isConnected[city][ne]==1 && !v[ne])
            {
                dfs(ne,v,isConnected);
            }
        }
    }
}