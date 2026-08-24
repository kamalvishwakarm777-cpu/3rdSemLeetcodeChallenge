class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                   if(i == j){
                    continue;
                   }
                   else {
                    int[] arr = {i,j};
                    nums = arr;
                   }
                }
            }
        }
        return nums;
    }
}