class Solution {
    public String solution(String rsp) {
        
        String[] split = rsp.split("");

        String answer = "";

        for(int i = 0; i < split.length; i++) {
            if (split[i].equals("2")) {
                answer += "0";
            } else if (split[i].equals("0")) {
                answer += "5";
            }else if(split[i].equals("5")){
                answer +=  "2";
            }
        }
        
        return answer;
    }
}