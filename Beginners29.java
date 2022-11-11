public class Beginners29 {

    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            int maxIndex = 0;
            int leftSum = 0;


            for(int i = 0; i < sides.length; i++){
                if(sides[maxIndex] < sides[i]){     // side의 i번째가 maxindex번째 보다 크면
                    maxIndex = i;                   // maxIndex에 i를 넣어준다.  (가장 긴 변)
                }
            }
            for(int i = 0; i < sides.length; i++){
                if(i != maxIndex){                  // i가 maxIndex와 같지 않으면
                    leftSum += sides[i];            // leftSum에 side의 i번째를 계속 더해준다  (나머지 두변의 합)
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
