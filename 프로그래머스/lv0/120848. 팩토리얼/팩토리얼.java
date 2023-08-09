import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            tmp *= i;
            if(tmp <= n){
                list.add(i);
            }
        }
        answer = list.get(list.size() - 1);
        
        return answer;
    }
}