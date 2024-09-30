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

        for (int i = 0; i < emergency.length; i++) {
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}