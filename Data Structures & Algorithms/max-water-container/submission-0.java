class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0, j = heights.length-1;
        while(i<j){
            int area = Math.min(heights[i], heights[j]) * (j-i);
            if(heights[i] <= heights[j]){
                i++;
            }else{
                j--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
