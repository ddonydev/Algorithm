public class Beginners09 {

    public int solution(int n) {
        int answer = 0;

        // 짝수가 되려면 == 0 홀수면 == 1
        for(int i = 0; i <= n; i++){
            if(i%2 == 0){
                answer += i;
            }
        }

        return answer;
    }

}
