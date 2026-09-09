class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int n:nums)
        {
            h.put(n,h.getOrDefault(n,0)+1);
        }
        int maxFreq = 0;
        int ans = 0;

        for(int key : h.keySet())
        {
          if(h.get(key) > maxFreq)
          {
            maxFreq = h.get(key);
            ans = key;
          }
        }
        return ans;
    //     int count=0;
    //     int nn=0;
    //     for(int n:nums)
    //     {
    //         if(count==0)
    //         {
    //             nn=n;
    //         }
    //         if(n==nn)
    //         {
    //             count++;
    //         }
    //         else
    //         {
    //             count--;
    //         }
    //     }
    //   return nn;
    }
}