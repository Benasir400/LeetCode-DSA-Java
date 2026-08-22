class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int t=n;
        while(t>0)
        {
            int d=t%10;
            sum+=d;
            pro*=d;
            t=t/10;
        }
        int tot=sum+pro;
        return n%tot==0;
    }
}