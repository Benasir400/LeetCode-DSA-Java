class Solution {
    List<Integer> o=new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        boolean v[]=new boolean[numCourses];
        boolean p[]=new boolean[numCourses];
        for(int pre[]:prerequisites)
        {
            int co=pre[0];
            int pr=pre[1];
            graph.get(pr).add(co);
        }
        for(int i=0;i<numCourses;i++)
        {
            if(!v[i])
            {
                if(dfs(i,v,p,graph))
                {
                    return new int[0];
                }
            }
        }
        Collections.reverse(o);
        int arr[]=new int[o.size()];
        for(int i=0;i<o.size();i++)
        {
            arr[i]=o.get(i);
        }
        return arr;
    }
    private boolean dfs(int n,boolean v[],boolean p[],List<List<Integer>> graph)
    {
        v[n]=true;
        p[n]=true;
        for(int nei:graph.get(n))
        {
            if(!v[nei])
            {
                if(dfs(nei,v,p,graph))
                {
                    return true;
                }
            }
            else if(p[nei])
            {
                return true;
            }
        }
        p[n]=false;
        o.add(n);
        return false;
    }
}