class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double current = 0;
        for(int i=0;i<k;i++){
            current+=nums[i];
        }
        double maxx = current/k;
        for(int i=1;i<=nums.length-k;i++){
            current = current - nums[i-1] + nums[k+i-1];
            if(current/k>maxx){
                maxx = current/k;
            }
        }
        return maxx;
    }
}