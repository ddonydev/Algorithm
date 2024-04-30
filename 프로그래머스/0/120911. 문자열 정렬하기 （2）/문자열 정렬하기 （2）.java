import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}