import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i]) && list.size() < k){
                list.add(arr[i]);
            }
        }

        if (list.size() < k) {
            int len = k - list.size();
            for (int i = 0; i < len; i++) {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}