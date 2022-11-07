class Solution {
    static int[] sum;
    
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
    
        sum = new int[nums.length + 1];
        for (int i = 0; i< nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        
        //first -> second
        //secodn -> first
        return Math.max(solve1(firstLen, secondLen), solve1(secondLen, firstLen));
    }
    
    static int solve1(int L, int M) {
        
        int maxF = 0;
        int s = 0;
        for (int i = L + M; i <sum.length;i++) {
            maxF = Math.max(maxF, sum[i - M] - sum[i - M - L]);
            s = Math.max(s , maxF + sum[i] - sum[i - M]);
        }
        
        return s;
    }
    
}