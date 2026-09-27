import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;

        for(int n : numSet){
            if(!numSet.contains(n - 1)){
                int count = 1;
                
                while(numSet.contains(n + count)){
                    count++;
                }

                longest = Math.max(longest,count);
            }
        }

        return longest;
    }
}