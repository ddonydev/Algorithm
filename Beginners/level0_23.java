package Beginners;

public class level0_23 {

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];

            for(int i = num_list.length; i > 0; i--){
                answer[num_list.length - i] = num_list[i-1];
            }

            return answer;
        }
    }

}
/*
 * num_list의 길이가 10인 배열이라면 *
1. for문은 10 부터 1까지 돌게 된다(거꾸로)
2. 배열을 뒤집으려면 위치에 값을 넣어주어야 한다.
3. answer[num_list.length - i] 는 위치
num_list[i-1] 위치의 값이 들어가게 되어
4. answer[num_list.length - i]의 위치에 num_list[i-1]의 값을 넣어주게 된다.
 */
