// Last updated: 8/21/2026, 12:26:11 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        Collections.sort(nums);
4        int i = 0;
5        int j = nums.size() - 1;
6        int count = 0;
7
8        while (i < j ){
9            int sum = nums.get(i) + nums.get(j);
10            if ( sum < target){
11                count = count + (j - i);
12                i = i + 1;
13            }else{
14                j = j - 1;
15            }
16        }
17
18        return count;
19        
20    }
21}