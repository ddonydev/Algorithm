import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
        int min = 999999999;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]){
                    min = Math.min(min, arr[j]);
                }
            }
            if (min == 999999999){
                list.add(-1);
            }else{
                list.add(min);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}