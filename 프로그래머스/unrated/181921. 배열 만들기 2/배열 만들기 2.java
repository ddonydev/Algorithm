import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '5' || s.charAt(j) == '0') {
                    cnt++;
                }
            }
            if (cnt == s.length()) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}