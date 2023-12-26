import java.util.*;
class Solution {
    public int solution(String dartResult) {
        String[] dartStr = dartResult.split("");
        
        Map<String, Integer> map = new HashMap<>();
        map.put("S", 1);
        map.put("D", 2);
        map.put("T", 3);

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
                String ch = dartStr[i];
                int num = stack.pop();
                if(ch.equals("S") || ch.equals("D") || ch.equals("T")){
                    num = (int) Math.pow(num, map.get(ch));
                }else if (dartStr[i].equals("*")) {
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

        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}