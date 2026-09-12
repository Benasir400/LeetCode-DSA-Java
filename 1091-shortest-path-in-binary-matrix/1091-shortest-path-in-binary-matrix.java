class Solution {
    Queue<int[]> q=new LinkedList<>();
    int dr[]={-1,-1,-1,0,0,1,1,1};
    int dc[]={-1,0,1,-1,1,-1,0,1};
    public int shortestPathBinaryMatrix(int[][] grid) {
       int n=grid.length;
       if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
       q.offer(new int[]{0,0,1});
       grid[0][0]=1;
       while(!q.isEmpty())
       {
         int cur[]=q.poll();
         int r=cur[0];
         int c=cur[1];
         int d=cur[2];
         if(r==n-1 && c==n-1)
         {
            return d;
         }
         for(int i=0;i<8;i++)
         {
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nr<n && nc>=0 && nc>=0 && nc<n && grid[nr][nc]==0)
            {
                grid[nr][nc]=1;
                q.add(new int[]{nr,nc,d+1});
            }
         }
       }
       return -1;
    }
}