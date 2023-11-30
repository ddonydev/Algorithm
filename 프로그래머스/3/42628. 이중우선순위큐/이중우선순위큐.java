import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        String commandOne = "I";
        String commandTwo = "D 1";
        String commandThree = "D -1";

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains(commandOne)) {
                String[] str = operations[i].split("I ");
                list.add(Integer.valueOf(str[1]));
            } else if (operations[i].equals(commandTwo) && list.size() != 0) {
                int max = Collections.max(list);
                list.remove(Integer.valueOf(max));
            } else if (operations[i].equals(commandThree) && list.size() != 0) {
                int min = Collections.min(list);
                list.remove(Integer.valueOf(min));
            }
        }

        int[] answer = new int[2];
        if (list.size() == 0) {
            answer[0] = 0;
            answer[1] = 0;
        }else{
            int max = Collections.max(list);
            int min = Collections.min(list);
            answer[0] = max;
            answer[1] = min;
        }
        return answer;
    }
}