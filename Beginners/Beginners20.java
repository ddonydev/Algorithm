package Beginners;

public class Beginners20 {

    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;

            for(int i = 0; i < array.length; i++){
                if(height < array[i]){
                    answer++;   // if문의 조건이 만족하면 answer에 카운트를 해줌
                }
            }

            return answer;
        }
    }

}
