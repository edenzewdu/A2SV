class Solution {
     public int minSetSize(int[] arr) {
        int max = Integer.MIN_VALUE;
         for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];
       for (int num : arr) {
          count[num]++;
         }
         Arrays.sort(count);
         int half = arr.length / 2;
         int res = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            half -= count[i];
             res++;
            if (half <= 0) {
                 return res;
            }
         }
         return arr.length;
     }
 }