class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> ret = new Stack<>();
        
        //counter for popped array
        int k = 0;
        // counter for pushed array 
        int j = 0;
        
        while(k < popped.length){
            // condition if my stack gets empty midway
            if(ret.size() == 0){
                // no push operations left 
                if( j == pushed.length)
                    return false;
                ret.add(pushed[j]);
            }
            // start adding until you find the push
            while(ret.peek() != popped[k]){
                if( j == pushed.length)
                    return false;
                ret.add(pushed[j]);
                j += 1;
            }
            // you found the element 
            // pop from stack and increase the index
            ret.pop();
            // increment the index in the popped array 
            k += 1;
        }
        
        return true;    
    }
}

