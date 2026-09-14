class Solution(object):
    def isAnagram(self, s, t):
        s1=sorted(s)
        t1=sorted(t)
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if(s1[i]!=t1[i]):
                return False
        return True
        