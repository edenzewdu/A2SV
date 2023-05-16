class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        r_list = []
        for i in range(n):
            if (i+1)%3 == 0:
                if (i+1)%5 == 0 :
                    r_list.append("FizzBuzz")
                else :
                    r_list.append("Fizz")
            elif (i+1)%5 == 0:
                r_list.append("Buzz")
            else :
                r_list.append(str(i+1))
        return r_list
