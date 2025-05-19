class SingleElementInArray {
    public int singleNumber(int[] nums) {
        int count=0;
        int n=0;
        for(int i=0;i<nums.length; i++ ){
            for(int j=0; j<nums.length;j++){
            if(nums[i]==nums[j]){
                count+=1;
            }
            if(count==2){
                count =0;
                break;
            }
            }
            if(count==1){
             n= nums[i];
            }
        }
      return(n) ;
    }
}
