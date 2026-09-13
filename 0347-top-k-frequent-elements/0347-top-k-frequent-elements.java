class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int nu:m.keySet())
        {
            p.offer(nu);
            if(p.size()>k)
            {
                p.poll();
            }
        }
        int ans[]=new int[p.size()];
        for(int i=k-1;i>=0;i--)
        {
           ans[i]=p.poll();
        }
        return ans;
    }
}