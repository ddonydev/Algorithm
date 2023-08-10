import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int i, int j, int k) {
        List<String> list = new ArrayList<>();

        for (int l = i; l <= j; l++) {
            list.add(Integer.toString(l));
        }

        int answer = 0;

        for (int l = 0; l < list.size(); l++) {
            String[] str = list.get(l).split("");
            for (int m = 0; m < str.length; m++) {
                if(str[m].contains(Integer.toString(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}