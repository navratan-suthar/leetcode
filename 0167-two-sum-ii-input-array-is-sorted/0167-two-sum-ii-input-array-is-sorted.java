class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f = 0;
        int last = numbers.length-1;
        while(f<last){
            if(numbers[f]+numbers[last]>target){
                last--;
            }
            else if(numbers[f]+numbers[last]<target){
                f++;
            }
            else{
                break;

            }
        }
        return new int[]{f+1,last+1};
    }
}