class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max=0;
        int ans =0;
        for(int i =0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for(int i : freq.keySet()){
            if(freq.get(i)>max){
                max= freq.get(i);
                ans = i;
            }
        }
        return ans;
    }
    
}