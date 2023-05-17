class Solution(object):
    def sortSentence(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = s.split()
        ans = [None]*len(s)
        for i in range(len(s)):
            ans[int(s[i][-1])-1] = s[i][:-1]
        return ' '.join(ans)
