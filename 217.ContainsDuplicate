class Solution {
    public boolean containsDuplicate(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean cont=false;
        for(int i=0;i<nums.length;i++){
            int searchVar =stack.search(nums[i]);
            if(searchVar!=-1){
                cont = true;
                break;
                
        }
    stack.push(nums[i]);
     cont = false;
    
    }
        return cont;
    }
}

//Passed 65/72 Test cases
//Fail Reason: Time Limit Exceeded
