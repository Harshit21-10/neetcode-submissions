class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        // int val1 = 0;
        // int val2 = 0;
        // for(int i=0; i<=nums.length-1; i++){
        //     for(int j = i+1; j<=nums.length-1; j++){
        //         if(nums[i] + nums[j] == target){
        //             val1 = i;
        //             val2 = j;
                    
        //         }
        //     }
        // }
        // int[] arr ={val1, val2};
        // return arr;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] { map.get(diff), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
