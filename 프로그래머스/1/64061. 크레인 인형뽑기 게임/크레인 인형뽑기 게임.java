import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            int num1 = 0;
            int size = stack.size();
            if(stack.size() > 0){
                num1 = stack.peek();
            }

            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    stack.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }

            if (stack.size() == size) {
                continue;
            }

            if (num1 == stack.peek()) {
                stack.pop();
                stack.pop();
                answer += 2;
            }

        }
        return answer;
    }
}
