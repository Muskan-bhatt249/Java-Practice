class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]== target){
                return i;
            }
            else{
                int position=0;
                for(int j=0; j<nums.length; j++){
                    if (nums[j]<target){
                        position++;
                    }
                }
                return position;
            }

        }
       return 0; 
    }
}
