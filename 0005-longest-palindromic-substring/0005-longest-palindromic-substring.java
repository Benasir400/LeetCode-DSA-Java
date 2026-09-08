class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String c=s.substring(i,j+1);
                if(isPalindrome(c) && c.length() > res.length())
                {
                  res = c;
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String c)
    {
        int left=0;
        int right=c.length()-1;
        while(left<right)
        {
            if(c.charAt(left)!=c.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}