import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){
                index.add(i);
            }
        }
        
        if(index.size() != 0){
            for (int i = index.get(0); i <= index.get(index.size() - 1); i++) {
                list.add(arr[i]);
            }
        }else{
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}