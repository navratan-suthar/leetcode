import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int extra) {
        List<Boolean> l = new ArrayList<>();
        int maxx = 0;
        for(int i:can){
            if(i>maxx){
                maxx = i;
            }
        }
        for(int i=0;i<can.length;i++){
            if(can[i]+extra>=maxx){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}