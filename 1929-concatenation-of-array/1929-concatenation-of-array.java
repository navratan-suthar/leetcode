class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int x = n*2;
        int arr[] = new int[x];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
        for(int j=0;j<n;j++){
            arr[n+j] = nums[j]; 
        }
        return arr;
    }
}