// Last updated: 7/9/2026, 12:33:12 PM
class Solution {
    public int pivotIndex(int[] a) {
        int n = a.length;
        int sum = 0;

        // Calculate total sum
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        int left = 0;

        // Find pivot index
        for (int i = 0; i < n; i++) {
            int right = sum - left - a[i];

            if (left == right) {
                return i;
            }

            left += a[i];
        }

        return -1;
    }
}