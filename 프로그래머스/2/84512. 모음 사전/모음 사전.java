import java.util.*;
class Solution {
    static String[] words;
    static ArrayList<String> list;
    public int solution(String word) {
        words = new String[]{"A", "E", "I", "O", "U"};
        list = new ArrayList<>();

        dfs("", 0);

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    static void dfs(String str, int len) {
        list.add(str);
        if (len == 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], len + 1);
        }
    }
}