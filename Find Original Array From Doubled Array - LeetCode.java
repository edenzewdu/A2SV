class Solution {
    public int[] findOriginalArray(int[] changed) {
        int[] n;
        int empty [] = {};
        n = new int[100];
        n = Arrays.copyOf(n,changed.length/2);
        int k=changed.length/2;
        if(changed.length%2==0){
            for(int i=0;i<changed.length/2;i++){
                if(changed[i]*2==(changed[k])){
                    n[i]=changed[i];
                    k++;
                }
                
                else
                return empty;
            }
        }
        else{
            return empty;
        }
         return n;
    }
}