import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        int x = 0;
        List<Integer> list = new ArrayList<>(Arrays.asList(n));

        if(n % 2 == 0){
            x = n / 2;
            list.add(x);
        }else{
            x = 3 * n + 1;
            list.add(x);
        }

        while (x != 1){
            if(x % 2 == 0){
                x /= 2;
                list.add(x);
            }else{
                x = 3 * x + 1;
                list.add(x);
            }

        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}