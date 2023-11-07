import java.util.*;
class Solution {
    public int solution(int[] array) {
        if(array.length == 1){
            return array[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int v = map.get(array[i]);
                map.put(array[i], ++v);
            }else{
                map.put(array[i], 1);
            }
        }

        int max = 1;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                key = entry.getKey();
                max = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                if (key != entry.getKey()) {
                    return -1;
                }
            }
        }
        return key;
    }
}