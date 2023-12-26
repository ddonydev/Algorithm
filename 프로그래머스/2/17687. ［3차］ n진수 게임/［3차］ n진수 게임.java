import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= t * m; i++){
            String s = Integer.toString(i, n);
            s = s.toUpperCase();
            if (s.length() > 1) {
                String[] str = s.split("");
                for (int j = 0; j < str.length; j++) {
                    list.add(str[j]);
                }
            }else{
                list.add(s);
            }
        }

        for (int i = p - 1; i < list.size(); i += m) {
            answer += list.get(i);
            if(answer.length() == t){
                break;
            }
        }
        return answer;
    }
}