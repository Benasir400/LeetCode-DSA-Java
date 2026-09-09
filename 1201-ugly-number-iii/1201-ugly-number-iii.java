class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long low=1;
        long high=2000000000L;
        long ab=lcm(a,b);
        long bc=lcm(b,c);
        long ac=lcm(a,c);
        long abc=lcm(a,bc);
        while(low<high)
        {
            long mid=low+(high-low)/2;
            long co=mid/a+mid/b+mid/c-mid/ab-mid/bc-mid/ac+mid/abc;
            if(co>=n)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return (int)low;
    }
    public long lcm(long a,long b)
    {
        return a*b/gcd(a,b);
    }
    public long gcd(long a,long b)
    {
      while(b!=0)
      {
        return gcd(b,a%b);
      }
      return a;
    }
}