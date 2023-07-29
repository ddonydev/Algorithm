class Solution {
    public int[] solution(int[] array) {
        int tmp = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(tmp < array[i]){
                tmp = array[i];
                index = i;
            }
        }

        int[] answer = new int[2];
        answer[0] = tmp;
        answer[1] = index;
        return answer;
    }
}