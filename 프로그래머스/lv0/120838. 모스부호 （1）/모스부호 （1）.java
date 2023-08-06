import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        String[] tmp = letter.split(" ");

        String[] str = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
                        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
                        "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
                        "k", "l", "m", "n", "o", "p", "q", "r", "s", 
                        "t", "u", "v", "w", "x", "y", "z"};

        Map<String, String> morse = new HashMap<>();

        for (int i = 0; i < abc.length; i++) {
            morse.put(str[i], abc[i]);
        }

        String answer = "";

        for (int i = 0; i < tmp.length; i++) {
            answer += morse.get(tmp[i]);
        }
        return answer;
    }
}