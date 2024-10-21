class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i = 0;
        while(i < num_list.length){
            while(num_list[i] != 1){
               if(num_list[i] % 2 != 0){
                   num_list[i] -= 1;
               }
                num_list[i] /= 2;
                answer++;
            }
            i++;
        }
        return answer;
    }
}