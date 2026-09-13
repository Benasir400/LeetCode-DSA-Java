class Solution {
    int parent[];
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }
        for(int e[]:edges)
        {
            int u=e[0];
            int v=e[1];
            if(find(u)==find(v)) return e;
            union(u,v);
        }
        return new int[0];
    }
    private int find(int x)
    {
        if(parent[x]==x) return x;
        return find(parent[x]);
    }
    private void union(int a,int b)
    {
        int pa=find(a);
        int pb=find(b);
        if(pa!=pb)
        {
            parent[pb]=pa;
        }
    }
}