import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int cnt = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                cnt += 1;
            }
            list.add(cnt);
        }

        List<Integer> tmp = new ArrayList<>();
        int deployDate = list.get(0);
        int cnt = 1;
        for (int i = 1; i < list.size(); i++) {
            if(deployDate < list.get(i)){
                tmp.add(cnt);
                cnt = 1;
                deployDate = list.get(i);
            } else if (deployDate >= list.get(i)) {
                cnt += 1;
            }

            if (i == list.size() - 1) {
                tmp.add(cnt);
            }
        }
        
        int[] answer = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}