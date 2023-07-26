class Solution {
    public String solution(String myString, String pat) {
        int x = myString.lastIndexOf(pat);

        String str = myString.substring(0, x);

        String answer = str + pat;
        
        return answer;
    }
}