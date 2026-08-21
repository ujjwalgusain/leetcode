// Last updated: 8/21/2026, 12:47:16 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> map = new HashMap<>();
4
5        for (int i = 0; i<= nums.length; i++){
6            int lookingFor = target - nums[i];
7
8            if (map.containsKey(lookingFor)){
9                return new int[]{
10                    i,
11                    map.get(lookingFor)
12                };
13
14            }
15
16            map.put(nums[i], i);
17        }
18
19        return new int[] {
20            -1,
21            -1
22        };
23        
24        
25    }
26}