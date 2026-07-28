class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        
        Arrays.sort(nums);

        for (int missing = 1; missing < nums[0]; missing++) {
            ans.add(missing);
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1 && nums[i+1]!= nums[i]){
                boolean next = false;
                int missing = nums[i] + 1;
                while (missing < nums[i+1]) {
                    ans.add(missing);
                    missing++;
                }
            }
        }
        if (nums.length > 0) {
            int lastElement = nums[nums.length - 1];
            for (int missing = lastElement + 1; missing <= nums.length; missing++) {
                ans.add(missing);
            }
        }
        return ans;

        


    }
}