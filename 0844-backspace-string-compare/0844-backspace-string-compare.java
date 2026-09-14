import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>lista = new Stack<>();
        Stack<Character>listb = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(!lista.isEmpty()){
                    lista.pop();
                }
                
            }
            else{
                    lista.push(s.charAt(i));
                }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(!listb.isEmpty()){
                    listb.pop();
                }
                
            }
            else{
                    listb.push(t.charAt(i));
                }
        }
        if(lista.equals(listb)){
            return true;
        }
        else{
            return false;
        }
    }
}