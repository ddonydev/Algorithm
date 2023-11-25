import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) {
                cnt1 += 1;
            }

            if (answers[i] == two[i % 8]) {
                cnt2 += 1;
            }

            if (answers[i] == three[i % 10]) {
                cnt3 += 1;
            }
        }

        int[] score = {cnt1, cnt2, cnt3};

        List<Integer> result = new ArrayList<>();
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                result.add(i + 1);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}