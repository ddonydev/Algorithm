import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(long n) {
        String tmp = String.valueOf(n);
        String[] str = tmp.split("");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(Integer.parseInt(str[i]));
        }

        Collections.reverse(list);
        int[] answer = new int[list.size()]; 

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}