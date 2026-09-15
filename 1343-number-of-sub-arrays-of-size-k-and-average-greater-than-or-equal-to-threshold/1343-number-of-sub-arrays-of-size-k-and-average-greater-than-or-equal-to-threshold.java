class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        double current = 0;
        for(int i=0;i<k;i++){
            current+=arr[i];
        }
        int c = 0;
        if(current/k>=t){
            c+=1;
        }
        for(int i=1;i<=arr.length-k;i++){
            current = current - arr[i-1]+arr[k+i-1];
            if(current/k>=t){
                c+=1;
            }
        }
        return c;
    }
}