class Solution {
    public int solution(String myString, String pat) {
        String[] str = myString.split("");

        int answer = 0;
        int len = pat.length();

        for (int i = 0; i < str.length - (len - 1); i++) {
            if(pat.equals(myString.substring(i, i + len))){
                answer++;
            }
        }
        return answer;
    }
}