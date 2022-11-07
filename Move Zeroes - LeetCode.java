class Solution {
    public void moveZeroes(int[] nums) {
       
        int i=0,j=0;
        
        int t=nums.length-1;
        while(i<=t)
        {
            if(nums[i]!=0)
            {
              
                nums[j++]=nums[i]; 
            }
            i++;
        }
        
        j=t-j+1;
        
        while(j!=0)
        {
            nums[t--]=0;
            j--;
        }
    }     
}