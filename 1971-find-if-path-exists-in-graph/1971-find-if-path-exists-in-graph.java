class Solution {
    List<List<Integer>>graph=new ArrayList<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int e[]:edges)
        {
            int u=e[0];
            int v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean v[]=new boolean[n];
        return dfs(source,destination,v);
    }
    public boolean dfs(int s,int d,boolean v[])
    {
        if(s==d)
        {
            return true;
        }
        v[s]=true;
        for(int node:graph.get(s))
        {
            if(!v[node])
            {
                v[node]=true;
                if(dfs(node,d,v))
                {
                    return true;
                }
            }
        }
        return false;
    }
}