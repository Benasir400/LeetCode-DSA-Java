class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]>q=new LinkedList<>();
        int dist[][]=new int[n][m];
        int dr[]={-1,0,0,1};
        int dc[]={0,-1,1,0};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.offer(new int[]{i,j});
                }
                else
                {
                    dist[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty())
        {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            for(int i=0;i<4;i++)
            {
                int nr=dr[i]+r;
                int nc=dc[i]+c;
                if(nr>=0 && nr<=n-1 && nc>=0 && nc<=m-1 && dist[nr][nc]==-1)
                {
                    dist[nr][nc]=dist[r][c]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        return dist;
    }
}