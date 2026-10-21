class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;
        int count1 = 0;int count2 = 0;

        for(int ele : nums){
            if(count1 == 0 && ele != elem2){
                elem1 = ele;
                count1 = 1;
            }
            else if(count2 == 0 && ele != elem1){
                elem2 = ele;
                count2 = 1;
            }
            else if(ele == elem1){
                count1++;
            }
            else if(ele == elem2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }


        List<Integer> list = new ArrayList<>();
        count1 = 0;count2 = 0;

        for(int ele : nums){
            if(elem1 == ele) count1++;
            if(elem2 == ele) count2++;
        }

        if(count1 > nums.length / 3) list.add(elem1);
        if(count2 > nums.length / 3) list.add(elem2);


        if(list.size() == 2 && list.get(0) > list.get(1)){
            int temp = list.get(0);
            list.set(0, list.get(1));
            list.set(1, temp);
        }

        return list;
    }
}