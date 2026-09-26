class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        for(int i=0;i<n;i++){
            arr[i+i] = nums[i];
            arr[i+1+i] = nums[n+i];
        }
        return arr;
    }
}