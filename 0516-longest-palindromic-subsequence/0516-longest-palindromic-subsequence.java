class Solution {
    int dp[][];
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        dp=new int[n][n];
        return solve(0,s.length()-1,s);
    }
    public int solve(int start,int end, String s)
    {
        if(dp[start][end]!=0)
        {
            return dp[start][end];
        }
        if(start>end) return 0;
        if(start==end) return 1;
        if(s.charAt(start)==s.charAt(end))
        {
            dp[start][end]=2+solve(start+1,end-1,s);
        }
        else
        {
            dp[start][end]=Math.max(solve(start+1,end,s),solve(start,end-1,s));
        }
        return dp[start][end];
    }
}