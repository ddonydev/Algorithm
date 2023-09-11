import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                int cnt = 0;
                for (int j = 1; j <= i; j++) {
                    if(i % j == 0){
                        cnt++;
                    }
                }
                if(cnt == 2){
                    list.add(i);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}