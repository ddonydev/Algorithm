class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            for (int j = 0; j < spell.length; j++) {
                int len = dic[i].length() - dic[i].replace(spell[j], "").length();
                if (dic[i].contains(spell[j]) && len == 1) {
                    cnt++;
                }
            }
            if (cnt == spell.length) {
                return 1;
            }
        }
        return 2;
    }
}