import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr = Arrays.copyOfRange(num_list, 0, n);
        int[] arr2 = Arrays.copyOfRange(num_list, n, num_list.length);

        int[] answer = new int[num_list.length];
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            answer[index++] = arr2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}