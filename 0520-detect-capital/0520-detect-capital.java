class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        char c1=word.charAt(0);
        for(char c:word.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                count++;
            }
        }
        if(count==0 || (count==1 && Character.isUpperCase(c1)) || count==word.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}