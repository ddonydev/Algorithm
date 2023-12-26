import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int s = 1;
        int d = 2;
        int t = 3;

        String[] dartStr = dartResult.split("");

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < dartStr.length; i++){
            if(dartStr[i].matches("[0-9]")){
                if(dartStr[i + 1].matches("[0-9]")){
                    String str = dartStr[i] + dartStr[i + 1];
                    stack.add(Integer.parseInt(str));
                    i += 1;
                }else {
                    stack.add(Integer.parseInt(dartStr[i]));
                }
            }else {
                int num = stack.pop();
                if(dartStr[i].equals("S")){
                    num = (int) Math.pow(num, s);
                }else if(dartStr[i].equals("D")){
                    num = (int) Math.pow(num, d);
                }else if(dartStr[i].equals("T")){
                    num = (int) Math.pow(num, t);
                } else if (dartStr[i].equals("*")) {
                    num *= 2;
                    if (stack.size() >= 1) {
                        int n = stack.pop();
                        n *= 2;
                        stack.add(n);
                    }
                }else if(dartStr[i].equals("#")) {
                    num *= -1;
                }
                stack.add(num);
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}