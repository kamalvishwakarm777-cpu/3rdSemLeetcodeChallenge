class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] array1 = new int[n / 2];
        int[] array2 = new int[n / 2];

        int p = 0;
        int q = 0;
        for(int i = 0;i < n;i++){

            if(nums[i] > 0){
                array1[p++] = nums[i];
            }
            else{
                array2[q++] = nums[i];
            }
        }


        int[] mergedArray = new int[n];
        int i = 0;
        int j = 0;

        for(int k = 0;k < n;k++){

            if(k % 2 == 0){
                mergedArray[k] = array1[i++];
            }
            else {
                mergedArray[k] = array2[j++];
            }
        }

        return mergedArray;
    }
}