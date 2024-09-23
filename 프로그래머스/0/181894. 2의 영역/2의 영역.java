import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        
        int end = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 2){
                end = i;
                break;
            }
        }
        
        if(start == 0 && end == 0){
            return new int[]{-1};
        }
        
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}