import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] copy = arr.clone();
        
        Arrays.sort(copy);
        
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == copy[0]){
                continue;
            }
            answer[index++] = arr[i];
        }
        if(answer.length == 0){
            return new int[]{-1};
        }
        
        return answer;
    }
}