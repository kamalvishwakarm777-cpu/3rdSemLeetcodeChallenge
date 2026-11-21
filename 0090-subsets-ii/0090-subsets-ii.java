class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        createSubset(nums,0,res,new ArrayList<>());
        return new ArrayList(res);   
    }
    
    public static void createSubset(int[] nums,int index,Set<List<Integer>> res,List<Integer> ans){

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