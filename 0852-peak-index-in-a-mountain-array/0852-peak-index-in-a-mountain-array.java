class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int r = arr.length-1;
        while(l<r && arr[l]<arr[l+1]){
            l++;
        }
        return l;
    }
}