class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int z = jewels.length()-1;
        int s = stones.length()-1;
        int c =0;
        for(int i=0;i<=z;i++){
            for(int j=0;j<=s;j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}