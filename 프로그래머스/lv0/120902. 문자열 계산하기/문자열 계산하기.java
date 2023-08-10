class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = 0;

        if(str[1].equals("+")){
            answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        }else{
            answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        }

        for (int i = 3; i < str.length; i++) {
            if(str[i].equals("+")){
                answer += Integer.parseInt(str[i + 1]);
            }
            if(str[i].equals("-")){
                answer -= Integer.parseInt(str[i + 1]);
            }
        }
        return answer;
    }
}