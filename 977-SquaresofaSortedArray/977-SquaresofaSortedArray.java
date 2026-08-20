// Last updated: 8/20/2026, 1:42:35 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int[] res = new int[nums.length];
4        int i = 0;
5        int j = nums.length - 1;
6        int k = nums.length - 1;
7
8        while(i<=j){
9            if(Math.abs(nums[i]) > Math.abs(nums[j])){
10                res[k] = nums[i] * nums[i];
11                i = i+1;
12
13            }else{
14                res[k] = nums[j] * nums[j];
15                j = j-1;
16            }
17            k = k-1;
18        }
19
20        return res;
21        
22
23        
24    }
25}