class Solution {
    public int reverse(int x) {
        
        long add = 0;
        while(x != 0){
            int rem = x%10;
            
            add = add*10 + rem;
            
            x = x/10;
            
        }
        if(add< Integer.MIN_VALUE || add > Integer.MAX_VALUE){
            return 0;
        }
        return (int)add;
        
    }
}