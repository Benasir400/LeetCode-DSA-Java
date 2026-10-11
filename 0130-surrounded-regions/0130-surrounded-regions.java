class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
           if(board[i][0]=='O')
           {
             dfs(i,0,board);
           }
           if(board[i][m-1]=='O')
           {
             dfs(i,m-1,board);
           }
        }
        for(int j=0;j<m;j++)
        {
            if(board[0][j]=='O')
            {
                dfs(0,j,board);
            }
            if(board[n-1][j]=='O')
            {
                dfs(n-1,j,board);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O')
                {   
                    board[i][j]='X';
                }
                else if(board[i][j]=='T')
                {
                    board[i][j]='O';
                }
            }
        }
    }
        private void dfs(int r,int c,char board[][])
        {
            if(r>=board.length || r<0 || c<0 || c>=board[0].length) return;
            if(board[r][c]!='O')
            {
                return;
            }
            board[r][c]='T';
            dfs(r+1,c,board);
            dfs(r-1,c,board);
            dfs(r,c+1,board);
            dfs(r,c-1,board);
        }
}