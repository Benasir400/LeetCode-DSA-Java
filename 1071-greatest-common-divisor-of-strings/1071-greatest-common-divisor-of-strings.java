class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1))
        {
             int l=gcd(str1.length(),str2.length());
             return str1.substring(0,l);
        }
        return "";
    }
    public int gcd(int a,int b)
    {
        if(b!=0)
        {
            return gcd(b,a%b);
        }
        return a;
      
    }
}