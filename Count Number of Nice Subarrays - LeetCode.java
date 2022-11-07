class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k - 1);
    }
    
    private int slidingWindow(int[] nums, int k) {
        int count = 0, ans = 0;
        for (int begin = 0, end = 0; end < nums.length; end++) {
            if ((nums[end] & 1) == 1) {
                count++;
            }
            while (count > k) {
                if ((nums[begin++] & 1) == 1) {
                    count--;
                }
            }
            ans += end - begin + 1;
        }
        return ans;
    }
}