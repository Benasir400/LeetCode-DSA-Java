class Solution {
    public boolean isValid(String s) {
       Stack<Character> sh=new Stack<>();
       for(char ch:s.toCharArray())
       {
         if(ch=='('||ch=='{'||ch=='[')
         {
            sh.push(ch);
         }
         else
         {
            if(sh.isEmpty()) return false;
            char top=sh.pop();
            if(top!='(' && ch==')')
            {
                return false;
            }
            if(top!='{' && ch=='}')
            {
                return false;
            }
            if(top!='[' && ch==']')
            {
                return false;
            }
         }
       }
       return sh.isEmpty();
    }
}
