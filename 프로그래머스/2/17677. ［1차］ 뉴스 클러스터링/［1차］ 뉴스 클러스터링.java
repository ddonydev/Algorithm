import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String s = "";
            for (int j = i; j <= i + 1; j++) {
                s += str1.charAt(j);
            }
            if (s.matches("[a-z]{2}")) {
                list1.add(s);
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String s = "";
            for (int j = i; j <= i + 1; j++) {
                s += str2.charAt(j);
            }
            if (s.matches("[a-z]{2}")) {
                list2.add(s);
            }
        }

        Set<String> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);

        int inter = 0;
        int complement = 0;

        for (String item : set) {
            int cnt1 = 0;
            int cnt2 = 0;
            for (String str : list1) {
                if (item.equals(str)) {
                    cnt1++;
                }
            }
            for (String str : list2) {
                if (item.equals(str)) {
                    cnt2++;
                }
            }
            inter += Math.min(cnt1, cnt2);
            complement += Math.max(cnt1, cnt2);
        }

        if (complement == 0) {
            return (int)Math.floor(1 * 65536);
        }

        double result = inter / (double) complement;
        int answer = (int) Math.floor(result * 65536);
        return answer;
    }
}