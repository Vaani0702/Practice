class Solution {

    int sum = 0;
    List<Integer> currList = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        helper(candidates, 0, target);

        return result;
    }

    void helper(int[] arr, int start, int target) {

        if (sum >= target) {
            if (sum == target) {
                result.add(new ArrayList<>(currList));
            }
            return;
        }

        for (int i = start; i < arr.length; i++) {

            sum += arr[i];
            currList.add(arr[i]);

            helper(arr, i, target);

            sum -= arr[i];
            currList.remove(currList.size() - 1);
        }
    }
}