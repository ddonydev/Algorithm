import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(Long.parseLong(arr[i]));
        }

        Collections.sort(list);

        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }
}