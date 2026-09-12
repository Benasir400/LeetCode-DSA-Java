class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
           graph.add(new ArrayList<>());
        }
        for(int pre[]:prerequisites)
        {
            int co=pre[0];
            int pr=pre[1];
            graph.get(pr).add(co);
        }
        boolean v[]=new boolean[numCourses];
        boolean p[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!v[i])
            {
                if(dfs(i,v,p,graph))
                {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int node,boolean v[],boolean p[],List<List<Integer>> graph)
    {
        v[node]=true;
        p[node]=true;
        for(int n:graph.get(node))
        {
            if(!v[n])
            {
                if(dfs(n,v,p,graph))
                 {
                   return true;
                 }
            }
            else if(p[n])
            {
                return true;
            }
        }
        p[node]=false;
        return false;
    }
}