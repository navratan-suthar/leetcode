import java.util.Stack;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> list = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(list.empty()){
                list.push(s.charAt(i));
            }
            else{
                if(list.peek()=='(' && s.charAt(i)==')'){
                    list.pop();
                }else{
                    list.push(s.charAt(i));
                }
            }
        }
        return list.size();
    }
}