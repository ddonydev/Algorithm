import java.util.*;
class Solution {
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();

        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }

        Collections.sort(list);

        long answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }
        return answer;
    }
}