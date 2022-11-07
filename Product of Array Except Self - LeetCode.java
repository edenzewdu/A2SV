class Solution {
   public int[] productExceptSelf(int[] nums) {
   
    int answer[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        int prod=1;
        for(int j=0;j<nums.length;j++){
            if(j!=i)
                
                prod=prod*nums[j];
        }
        answer[i]=prod;
    }
    return answer;
}
}