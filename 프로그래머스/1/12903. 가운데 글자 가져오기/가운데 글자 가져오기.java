class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        return str.length % 2 != 0 
            ? str[str.length / 2] : str[(str.length / 2) - 1] + str[str.length / 2];
    }
}