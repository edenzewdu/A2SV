class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int[] n;
        n = new int[100];
        n = Arrays.copyOf(n,nums.length);
        for(int i=0;i<nums.length;i++){
           n[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(n);
        for(int i=0;i<nums.length;i++){
            nums[i] = String.valueOf(n[i]);
        }
        String Ans = nums[nums.length-k];
        return Ans;
    } 
}