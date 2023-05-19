class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        arr = []
        sum = 0
        arr.append(0)
        if n > 0:
            for i in range(1, n+1):
                if i == 1:
                    sum = 1
                elif i > 1:
                    sum = arr[len(arr)-1] + arr[len(arr)-2]
                arr.append(sum)
        return (arr[len(arr)-1])
