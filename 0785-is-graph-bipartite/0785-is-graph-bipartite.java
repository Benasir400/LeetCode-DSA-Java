class Solution {
    
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int co[]=new int[n];
        Arrays.fill(co,-1);
        for(int i=0;i<n;i++)
        {
            if(co[i]==-1)
            {
                co[i]=0;
                if(!dfs(i,graph,co))
                {
                   return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int no,int graph[][],int co[])
    {
        for(int nei:graph[no])
        {
            if(co[nei]==-1)
            {
                co[nei]=1-co[no];
                if(!dfs(nei,graph,co))
                {
                    return false;
                }
            }
            else if(co[no]==co[nei])
            {
                return false;
            }
        }
        return true;
    }
}