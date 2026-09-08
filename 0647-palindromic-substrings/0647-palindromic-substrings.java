class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String ch=s.substring(i,j+1);
                if(isPal(ch))
                {
                    c++;
                }
            }
        }
        return c;
    }
    public boolean isPal(String ch)
    {
        int l=0,r=ch.length()-1;
        while(l<r)
        {
            if(ch.charAt(l)!=ch.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}