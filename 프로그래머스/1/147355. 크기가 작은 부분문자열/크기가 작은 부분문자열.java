class Solution {
    public int solution(String t, String p) {
        int p_len = p.length();

        String[] str = t.split("");

        long pNum = Long.parseLong(p);

        int answer = 0;

        for (int i = 0; i <= str.length - p_len; i++) {
            String tmp = "";
            for (int j = i; j < i + p_len; j++) {
                tmp += str[j];
            }
            long tNum = Long.parseLong(tmp);
            if (tNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}