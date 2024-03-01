import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        ArrayList<int[]> list = new ArrayList<>();
        for (int[] d : data) {
            if (d[map.get(ext)] < val_ext) {
                list.add(d);
            }
        }

        Collections.sort(list, (o1, o2)
                -> o1[map.get(sort_by)] - o2[map.get(sort_by)]);

        
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}