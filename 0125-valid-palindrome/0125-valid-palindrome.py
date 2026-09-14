class Solution(object):
    def isPalindrome(self, s):
        c=""
        for ch in s:
            if ch.isalnum():
                c+=ch.lower()
        l=0
        r=len(c)-1
        while(l<r):
            if(c[l]!=c[r]):
                return False
            l+=1
            r-=1
        return True
        