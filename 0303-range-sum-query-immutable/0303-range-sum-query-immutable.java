class NumArray {

    int arr[];
    int prefix[];

    public NumArray(int[] nums) {

        arr = nums;

        prefix = new int[arr.length + 1];

        prefix[0] = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];

        }
    }

    public int sumRange(int left, int right) {
        int sum = prefix[right + 1] - prefix[left];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left, right);
 */