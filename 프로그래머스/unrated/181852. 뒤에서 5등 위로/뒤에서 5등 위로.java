class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        
        for(int i = 0; i < num_list.length; i++){
            for(int j = i + 1; j < num_list.length; j++){
                if(num_list[i] > num_list[j]){
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        
        int index = 0;
        
        for(int i = 5; i < num_list.length; i++){
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}