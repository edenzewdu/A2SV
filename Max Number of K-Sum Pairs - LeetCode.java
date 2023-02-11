import java.util.Scanner;

public class Sq
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        long n = reader.nextInt();
class Solution {
   public int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);
    int count = 0;

    int i = 0;
    int j = nums.length - 1;

    while(i<j) {
        if(nums[i] + nums[j] > k) {
            j--;
        } else if(nums[i] + nums[j] < k) {
            i++;
        } else {
            count++;
            i++;
            j--;
        }
    }
    return count;
}
}