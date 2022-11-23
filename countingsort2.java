import java.util.*;
 
import java.util.*;
public class Solution {
 
    static int[] countingSort(int[] arr) {
        int[] counts = new int[1000000];
        for(int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
        return counts;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            for(int j=result[i];j>0;j--){
            System.out.print(i + (i != result.length - 1 ? " " : ""));}
        }
        System.out.println("");
 
 
        in.close();
    }
}