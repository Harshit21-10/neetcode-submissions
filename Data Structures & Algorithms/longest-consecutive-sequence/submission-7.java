class Solution {
    public int longestConsecutive(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(nums);
        int maxSize = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(!stack.isEmpty()){
                if(stack.peek() == nums[i]){
                    continue;
                }else{
                    if(stack.peek() + 1 == nums[i]){
                    stack.push(nums[i]);
                }else{
                    maxSize = Math.max(maxSize, stack.size());
                    while(!stack.isEmpty()){
                        stack.pop();
                    }
                    stack.push(nums[i]);
                }
                }
                
            }else{
                stack.push(nums[i]);
            }
        }
        return Math.max(maxSize, stack.size());
    }
}
