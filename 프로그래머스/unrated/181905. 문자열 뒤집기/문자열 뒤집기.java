class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String first = my_string.substring(0, s);
        String second = my_string.substring(s, e + 1);
        String third = my_string.substring(e + 1);
        String tmp = "";
        
        String[] str = second.split("");
        for(int i = str.length - 1; i >= 0; i--){
            tmp += str[i];
        }
        
        answer = first + tmp + third;
        
        return answer;
    }
}