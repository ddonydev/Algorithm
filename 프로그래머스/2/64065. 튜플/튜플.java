import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] str = s.split("\\{|,|\\}");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i].matches("[0-9]+")) {
                map.put(Integer.valueOf(str[i]), map.getOrDefault(Integer.valueOf(str[i]), 0) + 1);
            }
        }
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        int[] answer = new int[map.size()];
        int index = 0;
        for(Integer key : keySetList) {
            answer[index] = key;
            index++;
        }
        return answer;
    }
}