class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        if (2 * k + 1 > n)
            return ans;

        long[] prefix = new long[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int window = 2 * k + 1;

        for (int i = k; i <= n - k - 1; i++) {

            int left = i - k;
            int right = i + k;

            long sum;

            if (left == 0) {
                sum = prefix[right];
            } else {
                sum = prefix[right] - prefix[left - 1];
            }

            ans[i] = (int) (sum / window);
        }

        return ans;
    }
}