import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Stage[] stage = new Stage[N];
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
            if (total == 0) {
                stage[i - 1] = new Stage(i, 0);
            }else{
                stage[i - 1] = new Stage(i, (double) cnt / total);
            }
            
        }
        
        Arrays.sort(stage);

        for (int i = 0; i < stage.length; i++) {
            answer[i] = stage[i].current;
        }
        return answer;
    }
}

class Stage implements Comparable<Stage>{
    int current;
    double fail;

    public Stage (int current, double fail) {
        this.current = current;
        this.fail = fail;
    }

    @Override
    public int compareTo(Stage o) {
        return Double.compare(o.fail, this.fail);
    }
}