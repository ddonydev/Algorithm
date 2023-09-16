import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] tmp = new int[arr.length];

        int cnt = 0;

        while (!Arrays.equals(arr, tmp)) {
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = (arr[i] * 2) + 1;
                }
            }

            cnt++;

        }
        
        int answer = cnt - 1;

        
        return answer;
    }
}