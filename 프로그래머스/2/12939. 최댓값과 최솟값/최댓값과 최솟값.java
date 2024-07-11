class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

        int max = -99999999;
        int min = 99999999;
        for (int i = 0; i < str.length; i++) {
            max = Math.max(max, Integer.parseInt(str[i]));
            min = Math.min(min, Integer.parseInt(str[i]));
        }

        return String.valueOf(min) + " " + String.valueOf(max);
    }
}