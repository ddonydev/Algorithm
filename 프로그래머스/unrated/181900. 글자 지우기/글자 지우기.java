import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);

        String answer = "";
        String[] arr = my_string.split("");

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = indices.length - 1; i >= 0; i--) {
            list.remove(indices[i]);
        }
        
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}