class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" ");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[2]);
            int z = Integer.parseInt(tmp[4]);
            int result = 0;

            if (tmp[1].equals("+")) {
                result = x + y;
            } else if (tmp[1].equals("-")) {
                result = x - y;
            }

            if (result == z) {
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}