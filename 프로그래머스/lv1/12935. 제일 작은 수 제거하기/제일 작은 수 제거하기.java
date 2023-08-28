import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min){
                list.add(arr[i]);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}