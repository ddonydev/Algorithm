import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>(Arrays.asList(n));

        if(n % 2 == 0){
            n = n / 2;
            list.add(n);
        }else{
            n = 3 * n + 1;
            list.add(n);
        }

        while (n != 1){
            if(n % 2 == 0){
                n /= 2;
                list.add(n);
            }else{
                n = 3 * n + 1;
                list.add(n);
            }

        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}