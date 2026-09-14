class Solution {
    public int countOdds(int low, int high) {
        int all = high - low - 1 + 2;
        if(low%2==0 && high%2==0){
            int bytwo = all - all/2;
            return bytwo-1;
        }
        else{
            return all-all/2;
        }
    }
}