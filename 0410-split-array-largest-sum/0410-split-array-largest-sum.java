class Solution {
    public int splitArray(int[] nums, int k) {
       
        int left = 0, right = 0;
        for (int n : nums) {
            left = Math.max(left, n);
            right += n;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int pieces = 1, cur = 0;
        for (int n : nums) {
            if (cur + n > maxSum) {
                pieces++;
                cur = n;
                if (pieces > k) return false;
            } else cur += n;
        }
        return true;
    }

}