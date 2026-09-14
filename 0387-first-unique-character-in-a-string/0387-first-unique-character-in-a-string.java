class Solution {
    public int firstUniqChar(String s) {
        
        for(int i=0;i<s.length();i++){
            boolean uniq=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    uniq=false;
                    break;
                }
            }
            if(uniq){
                return i;
            }
        }
        return -1;
    }
}