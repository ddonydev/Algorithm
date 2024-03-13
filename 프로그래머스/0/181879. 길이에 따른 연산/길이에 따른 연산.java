import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        
        int len = num_list.length;
        
        int answer = 0;
        if(len <= 10){
            return Arrays.stream(num_list).reduce((a, b) -> a * b).getAsInt();
        }else{
            return (int) Arrays.stream(num_list).mapToLong(i -> i).sum();
        }
        
        
    }
}