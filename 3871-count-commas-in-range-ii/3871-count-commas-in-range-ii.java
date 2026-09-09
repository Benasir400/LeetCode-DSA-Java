class Solution {
    public long countCommas(long n) {
        long r=0;
        for(long i=1000;i<=n;i*=1000)
        {
            r+=n-i+1;
        }
        return r;
    }
}