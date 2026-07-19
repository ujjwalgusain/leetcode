// Last updated: 7/19/2026, 2:52:23 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        int j = 1;
5        for (int i = 1; i<n; i++){
6            if(nums[i] != nums[j-1]){
7                nums[j] =nums[i];
8                j++;
9            }
10
11        }
12        return j;
13    }
14}