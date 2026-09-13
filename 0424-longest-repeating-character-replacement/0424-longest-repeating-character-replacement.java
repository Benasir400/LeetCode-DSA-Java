class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int fr[]=new int[26];
        int mf=0;
        int ans=0;
        for(int r=0;r<s.length();r++)
        {
           char ch=s.charAt(r);
           fr[ch-'A']++;
           mf=Math.max(mf,fr[ch-'A']);
           while((r-l+1)-mf>k)
           {
               fr[s.charAt(l)-'A']--;
               l++;
           }
           ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}