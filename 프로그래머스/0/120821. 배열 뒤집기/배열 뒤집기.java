import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);

        for (int i = 0; i < num_list.length; i++) {
            num_list[i] = list.get(i);
        }
        
        return num_list;
    }
}