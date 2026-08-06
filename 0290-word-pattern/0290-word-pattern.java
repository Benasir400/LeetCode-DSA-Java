class Solution {
    public boolean wordPattern(String pattern, String s) {
        String w[]=s.split(" ");
        if(w.length!=pattern.length())
        {
            return false;
        }
        HashMap<Character,String>m1=new HashMap<>();
        HashMap<String,Character>m2=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String d=w[i];
            if(m1.containsKey(c))
            {
                if(!m1.get(c).equals(d))
                {
                    return false;
                }
            }
            else
            {
              m1.put(c,d);  
            }
            if(m2.containsKey(d))
            {
                if(!m2.get(d).equals(c))
                {
                    return false;
                }
            }
            else
            {
              m2.put(d,c);  
            }
        }
        return true;
    }
}