import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int x = 0;
         List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
                x = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(x > k){
                list.add(x);
            }
        }
        
         int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}