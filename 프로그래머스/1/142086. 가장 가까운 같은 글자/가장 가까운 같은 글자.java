class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        String tmp = "";

        int[] answer = new int[s.length()];

        for (int i = 0; i < str.length; i++) {
            answer[i] = tmp.lastIndexOf(str[i]);

            if (tmp.contains(str[i])) {
                answer[i] = i - tmp.lastIndexOf(str[i]);
            }
            tmp += str[i];

        }
        return answer;
    }
}