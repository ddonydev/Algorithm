import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i).toString().split("");
            for (int j = 0; j < str.length; j++) {
                if(str[j].equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}