class Solution(object):
    def maximumWealth(self, accounts):
        maxi=float('-inf')
  
        for i in range(len(accounts)):
           sum=0
           for j in range(len(accounts[0])):
              sum+=accounts[i][j]
           maxi=max(sum,maxi)
        return maxi

        