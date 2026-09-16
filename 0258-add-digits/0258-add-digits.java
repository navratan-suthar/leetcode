class Solution {
    public int addDigits(int num) {
        int rem1 = 0;
        
        if(num<10){
            return num;
        }
        while(num>9){
            int sum=0;
            while(num>0){
            rem1 = num%10;
            sum+=rem1;
            num/=10;
            }
            num = sum;
        }
        return num;
    }
}