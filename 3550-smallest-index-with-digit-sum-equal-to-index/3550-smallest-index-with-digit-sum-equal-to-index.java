class Solution {
    public int smallestIndex(int[] nums) {
        int min=nums.length;
        int ind=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}