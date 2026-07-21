// Last updated: 7/21/2026, 1:30:36 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length-1;
5        int maxArea = 0;
6
7        while(left < right){
8            int currArea = Math.min(height[left], height[right]) * (right - left);
9            maxArea = Math.max(maxArea, currArea);
10
11            if(height[left] < height[right]){
12                left++;
13            }else{
14                right--;
15            }
16        }
17        return maxArea;
18    }
19}