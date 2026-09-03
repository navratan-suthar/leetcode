class Solution {
    public int findGCD(int[] nums) {
        int big = 0;
        int small = nums[1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>big){
                big = nums[i];
            }
            if(nums[i]<small){
                small = nums[i];
            }
        }
        int gcd = 1;
        for(int i=2;i<=small;i++){
            if(small%i == 0 && big%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}