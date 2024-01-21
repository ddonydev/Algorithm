class Solution {
    static boolean[] viseted;
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        viseted = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }
    static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (viseted[i]) {
                continue;
            }
            int len = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    len++;
                }
            }
            if (len == begin.length() - 1) {
                viseted[i] = true;
                dfs(words[i], target, words, cnt + 1);
                viseted[i] = false;
            }
        }
    }
}