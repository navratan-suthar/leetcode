class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0){
        //     return false;
        // }
        // String str = Integer.toString(x);
        // String newStr = "";
        // for(int i = str.length()-1;i>=0;i--){
        //     newStr = newStr+str.charAt(i);
        // }
        // return str.equals(newStr);
        int real = x;
        if(real<0){
            return false;
        }
        int rem =0;
        int num = 0;
        while(x>0){
            rem = x%10;
            num = (num*10)+rem;
            x = x/10;
        }
        if(num == real){
            return true;
        }
        else{
            return false;
        }
    }
}