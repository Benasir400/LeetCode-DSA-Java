class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char r[]=new char[n];
        for(int i=n-1;i>=0;i--)
        {
            r[n-i-1]=s[i];
        }
        for(int i=0;i<n;i++)
        {
            s[i]=r[i];
        }
    }
}