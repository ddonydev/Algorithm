class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        if(num_list.length % n != 0){
            len += 1;
        }
        int[] answer = new int[len];
        
        int index = 0;
        for(int i = 0; i < num_list.length; i += n){
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}