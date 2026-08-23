class Solution {
    public boolean validMountainArray(int[] arr) {
        int c=0;
        if(arr.length == 1){
            return false;
        }
        for(int i=0;i<arr.length-2;i++){
            
            if(arr[i]<arr[i+1]){
                c+=1;
                if(arr[i+1]>arr[i+2]){
                for(int j=i+1;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        c+=1;
                    }
                    else{
                        c-=1;
                    }
                }
                break;
            }
            }
            else{
                c-=1;
                break;
            }
            
        }
        if(c == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}