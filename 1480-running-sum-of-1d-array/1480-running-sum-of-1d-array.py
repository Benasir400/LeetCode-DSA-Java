class Solution(object):
    def runningSum(self, nums):
        sum=0
        run=[0]*(len(nums))
        for i in range(len(nums)):
            run[i]=sum+nums[i]
            sum+=nums[i]
        return run
        
        