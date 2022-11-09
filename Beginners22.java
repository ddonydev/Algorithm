public class Beginners22 {

    class Solution {
        public int[] solution(int[] num_list) {

            int even = 0;
            int odd = 0;

            for(int i = 0; i < num_list.length; i++){
                if(num_list[i]%2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
            int[] answer = {even, odd}; // for문 다 돌고나서 배열에 넣어주기

            return answer;
        }
    }

}
