class Solution {
    public int sumOfMultiples(int n) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0||i%5==0||i%7==0)
            {
                l.add(i);
            }
        }
        int sum=0;
        for(int num:l)
        {
            sum+=num;
        }
        return sum;
    }
}