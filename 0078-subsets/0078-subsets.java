class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        createSubset(nums,0,res,new ArrayList<>());
        return res;   
    }
    
    private static void createSubset(int[] nums,int index,List<List<Integer>> res,List<Integer> ans){

        if(index == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[index]);
        createSubset(nums,index + 1,res,ans);
        ans.remove(ans.size() - 1);
        createSubset(nums,index + 1,res,ans);
    }
}