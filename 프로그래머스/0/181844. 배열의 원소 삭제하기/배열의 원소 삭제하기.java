import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}