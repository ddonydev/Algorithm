import java.util.*;
class Solution
{
    public int solution(String s)
    {

        String[] str = s.split("");

        Stack<String> stack = new Stack<>();


        for (int i = 0; i < str.length; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek().equals(str[i])) {
                    stack.pop();
                }else{
                    stack.push(str[i]);
                }
            }else{
                stack.push(str[i]);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}