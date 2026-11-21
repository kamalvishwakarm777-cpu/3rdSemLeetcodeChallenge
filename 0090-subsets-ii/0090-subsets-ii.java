class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        createSubset(nums,0,res,new ArrayList<>());
        return res;   
    }
    
    public static void createSubset(int[] nums,int index,List<List<Integer>> res,List<Integer> ans){
        res.add(new ArrayList<>(ans));
        
        for(int i = index;i < nums.length;i++){
            if(i != index && nums[i] == nums[i - 1]) continue;

            ans.add(nums[i]);
            createSubset(nums,i + 1,res,ans);
            ans.remove(ans.size() - 1);
        }
    }
}