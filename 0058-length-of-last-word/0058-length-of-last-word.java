class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int n=s.length()-1;
        while(n>=0 && s.charAt(n) == ' '){
            n-=1;
        }

        while(n>=0 && s.charAt(n) != ' '){
            count+=1;
            n-=1;
            
        }
        return count;
    }
}