class Solution {
    public int smallestNumber(int n, int t) {
        while(prod(n)%t!=0)
          {
             n=n+1;
          }
        return n;
    }
    public int prod(int n)
    {
        int pro=1;
        while(n>0)
          {
          int d=n%10;
          pro=pro*d;
          n=n/10;
          }
        return pro;
    }
}