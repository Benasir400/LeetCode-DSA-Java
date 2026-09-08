class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int n=s.length();
        int left=0,right=n-1;
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-1-i))
            {
                    return false;
            }
        }
        return true;
    }
}