import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String newStr = s + s;
        for(int i = 0; i < s.length(); i++){
            if(isCorrect(newStr.substring(i, s.length() + i))){
                answer += 1;
            }
        }
        
        return answer;
    }
    
    boolean isCorrect(String s){
        String[] str = s.split("");
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("(") || str[i].equals("[") || str[i].equals("{")){
                stack.push(str[i]);
            }else if(stack.empty()){
                return false;
            }else if(str[i].equals(")") && stack.peek().equals("(")){
                stack.pop();
            }else if(str[i].equals("]") && stack.peek().equals("[")){
                stack.pop();
            }else if(str[i].equals("}") && stack.peek().equals("{")){
                stack.pop();
            }
        }
        
        if(stack.empty()){
            return true;
        }
        
        return false;
    }
}