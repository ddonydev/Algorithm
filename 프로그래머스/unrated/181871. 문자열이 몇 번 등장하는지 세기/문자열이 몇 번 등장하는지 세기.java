class Solution {
    public int solution(String myString, String pat) {
        String[] str = myString.split("");

        int answer = 0;

        for (int i = 0; i < str.length - (pat.length() - 1); i++) {
            if(pat.equals(myString.substring(i, i + pat.length()))){
                answer++;
            }
        }
        return answer;
    }
}