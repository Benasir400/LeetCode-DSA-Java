class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int g=0;
        for(int d:deck)
        {
            m.put(d,m.getOrDefault(d,0)+1);
        }
        for(int f:m.values())
        {
            g=gcd(g,f);
        }
        if(g>1)
        {
            return true;
        }
        return false;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}