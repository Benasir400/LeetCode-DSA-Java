class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s,0,new ArrayList<>());
        return res;
    }
    public void backtrack(String s,int start,List<String> path)
    {
        if(s.length()==start)
        {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end=start;end<s.length();end++)
        {
            if(isPalindrome(s,start,end))
            {
                path.add(s.substring(start,end+1));
                backtrack(s,end+1,path);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int l,int r)
    {
       while(l<r)
       {
         if(s.charAt(l)!=s.charAt(r))
         {
            return false;
         }
         l++;
         r--;
       }
       return true;
    }
}