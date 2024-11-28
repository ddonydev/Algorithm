import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> id = new HashMap<>();
        HashMap<String, Set<String>> map = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            id.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }

        for (String s : report) {
            String[] str = s.split(" ");
            map.get(str[1]).add(str[0]);
        }

        int[] answer = new int[id_list.length];
        for (String s : id.keySet()) {
            Set<String> set = map.get(s);
            if (set.size() >= k) {
                for (String name : set) {
                    answer[id.get(name)]++;
                }
            }
        }
        return answer;
    }
}