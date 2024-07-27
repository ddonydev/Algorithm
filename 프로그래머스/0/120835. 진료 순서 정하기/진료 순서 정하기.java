import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] copy = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = copy.length;
        for (int i = 0; i < copy.length; i++) {
            map.put(copy[i], count--);
        }

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}