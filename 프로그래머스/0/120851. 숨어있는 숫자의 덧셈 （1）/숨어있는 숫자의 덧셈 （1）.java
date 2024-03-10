class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[^0-9]","");
        
        String[] str = my_string.split("");

        int answer = 0;
        for (String s : str) {
            answer += Integer.parseInt(s);
        }
        return answer;
        
    }
}