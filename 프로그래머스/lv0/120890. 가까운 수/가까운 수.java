class Solution {
    public int solution(int[] array, int n) {
        int min = 999999999;
        int subtract = 0;

        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            subtract = Math.abs(n - array[i]);
            if(subtract < min) {
                min = subtract;
                answer = array[i];
            }
            if(subtract == min) {
                if(answer > array[i]) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}