class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int fr=0;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                {
                    fr++;
                }
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        int min=0;
        int dir[][]={{0,-1},{0,1},{-1,0},{1,0}};
        while(!q.isEmpty() && fr>0){
        int s=q.size();
        for(int i=0;i<s;i++)
        {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            for(int d[]:dir)
            {
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc]==1)
                {
                    grid[nr][nc]=2;
                    fr--;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        min++;
        }
        return fr==0 ? min : -1;
    }
}