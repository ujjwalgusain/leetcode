// Last updated: 8/20/2026, 1:43:19 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        for (int i = 1; i<n; i++){
            if(nums[i] != nums[j-1]){
                nums[j] =nums[i];
                j++;
            }

        }
        return j;
    }
}