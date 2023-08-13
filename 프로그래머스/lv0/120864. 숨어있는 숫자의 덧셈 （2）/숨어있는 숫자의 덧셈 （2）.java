class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split("[a-zA-Z]");
        int answer = 0;

        for (int i = 0; i < str.length; i++) {
            if(str[i] == null || str[i].isEmpty()){
                continue;
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}