class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int str = s.charAt(i);
            int sum = str + n;
            if (str >= 65 && str <= 90 && sum > 90) {
                sum -= 26;
            }

            if (str >= 97 && str <= 122 && sum > 122) {
                sum -= 26;
            }

            if (str == 32) {
                sb.append(" ");
                continue;
            }

            sb.append((char) sum);

        }   
        
        return sb.toString();
    }
}