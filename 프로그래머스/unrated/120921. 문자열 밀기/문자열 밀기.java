import java.util.*;
class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        
        int answer = 0;

        String[] strA = A.split("");
        String[] strB = B.split("");

        String[] tmp = new String[strA.length];
        
        for (int i = 0; i < strA.length; i++) {
            for (int j = 1; j < strA.length; j++) {
                tmp[0] = strA[strA.length - 1];
                tmp[j] = strA[j - 1];
            }
            for (int j = 0; j < strA.length; j++) {
                strA[j] = tmp[j];
            }
            answer++;
            if (Arrays.equals(strA, strB)) {
                return answer;
            }
        }

        if (!Arrays.equals(strA, strB)) {
            return -1;
        }
        return answer;
    }
}