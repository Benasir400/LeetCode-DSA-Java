class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE;
        for(int x:nums1)
        {
            if(x%2!=0)
            {
               minOdd=Math.min(minOdd,x);
            }
        }
        for(int c:nums1)
        {
            if(c%2==0 && minOdd!=Integer.MAX_VALUE && c<minOdd)
            {
                return false;
            }
        } 
        return true;
    }
}