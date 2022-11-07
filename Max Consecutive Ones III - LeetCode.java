class Solution {
    public int longestOnes(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int maxLength = 0;

        int left = 0;
        int right = 0;
        if (nums[right] == 0)
            k--;

        for (left = 0; left < n; left++) {
            while ( right + 1 < n && ( k > 0 || nums[right + 1] == 1 ) ) {
                if (nums[right + 1] == 0)
                    k--;
                right++;
            }

            if (k >= 0)
                maxLength = Math.max(maxLength, right - left + 1);

            if (nums[left] == 0)
                k++;
        }

        return maxLength;
    }
}