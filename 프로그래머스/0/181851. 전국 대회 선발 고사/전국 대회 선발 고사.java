import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == true) {
                map.put(rank[i], i);
                list.add(rank[i]);
            }
        }

        list.sort(Comparator.naturalOrder());

        int answer = (10000 * map.get(list.get(0))) + (100 * map.get(list.get(1))) 
            + map.get(list.get(2));
        return answer;
    }
}