import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i < N + 1; i++) {
            int total = 0;
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    total++;
                }
                if (stages[j] == i) {
                    cnt++;
                }
            }
            if (total == 0){
                map.put(i, (double) 0);
            }else{
                map.put(i, (double) cnt / total);
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) ->(map.get(o2).compareTo(map.get(o1))));

        int[] answer = new int[N];
        int index = 0;
        for (int key : keySet){
            answer[index] = key;
            index++;
        }
        return answer;
    }
}