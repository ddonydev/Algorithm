class Solution {
    public String solution(int[] food) {
        int len = 1;
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                len += food[i] - 1;
            }else{
                len += food[i];
            }
        }

        String answer = "";
        for (int i = 1; i < food.length; i++) {
            int divide = food[i] / 2;
            if (food[i] % 2 != 0 && food[i] > 1) {
                for (int j = 1; j <= divide; j++) {
                    answer += String.valueOf(i);
                }
            } else if (food[i] % 2 == 0) {
                for (int j = 1; j <= divide; j++) {
                    answer += String.valueOf(i);
                }
            }
        }

        answer += "0";

        for (int i = food.length - 1; i > 0; i--) {
            int divide = food[i] / 2;
            if (food[i] % 2 != 0 && food[i] > 1) {
                for (int j = 1; j <= divide; j++) {
                    answer += String.valueOf(i);
                }
            } else if (food[i] % 2 == 0) {
                for (int j = 1; j <= divide; j++) {
                    answer += String.valueOf(i);
                }
            }
        }
        return answer;
    }
}