class Solution {
    int m[][];
    int suf[];
    int n;
    public int stoneGameII(int[] piles) {
        n=piles.length;
        suf=new int[n];
        suf[n-1]=piles[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suf[i]+=piles[i]+suf[i+1];
        }
        m=new int[n][n+1];
        return dfs(0,1);
    }
    private int dfs(int i,int M)
    {
        if(i>=n)
        {
            return 0;
        }
        if(2*M>=n-i)
        {
            return suf[i];
        }
        if(m[i][M]!=0)
        {
            return m[i][M];
        }
        int ans=0;
        for(int x=1;x<=2*M;x++)
        {
            ans=Math.max(ans,suf[i]-dfs(i+x,Math.max(M,x)));
        }
        return m[i][M]=ans;
    }
}