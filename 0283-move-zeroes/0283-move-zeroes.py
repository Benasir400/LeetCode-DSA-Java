class Solution(object):
    def moveZeroes(self, nums):
       res=[]
       for i in nums:
           if i!=0:
             res.append(i)
       while len(res)<len(nums):
            res.append(0)
       for i in range(len(res)):
          nums[i]=res[i]
        