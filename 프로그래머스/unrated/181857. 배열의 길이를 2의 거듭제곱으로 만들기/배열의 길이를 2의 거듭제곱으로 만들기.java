class Solution {
    public int[] solution(int[] arr) {
        int x = 1;

        while (arr.length > x){
            x *= 2;
        }

        int[] answer = new int[x];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}