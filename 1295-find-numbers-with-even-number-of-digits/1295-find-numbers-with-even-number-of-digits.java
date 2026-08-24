class Solution {
    public int findNumbers(int[] nums) {
        int even_c = 0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            while(nums[i]>0){
                c+=1;
                nums[i] = nums[i]/10;
            }
            if(c%2 == 0){
                even_c+=1;
            }
        }
        return even_c;
    }
}