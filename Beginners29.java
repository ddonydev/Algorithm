public class Beginners29 {

    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            int maxIndex = 0;
            int leftSum = 0;


            for(int i = 0; i < sides.length; i++){
                if(sides[maxIndex] < sides[i]){
                    maxIndex = i;
                }
            }
            for(int i = 0; i < sides.length; i++){
                if(i != maxIndex){
                    leftSum += sides[i];
                }
            }

            if(sides[maxIndex] < leftSum){
                answer = 1;
            }else{
                answer = 2;
            }


            return answer;
        }
    }

}
