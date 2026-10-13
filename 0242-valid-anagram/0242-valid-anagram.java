class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int fr[]=new int[26];
        for(char c:s.toCharArray())
        {
            fr[c-'a']++;
        }
        for(char c:t.toCharArray())
        {
            fr[c-'a']--;
        }
        for(int f:fr)
        {
            if(f!=0)
            {
                return false;
            }
        }
        return true;
    }
}