class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i = 0; i < rny_string.length(); i++){
            if(rny_string.charAt(i) == 'm'){
                return rny_string.replace("m", "rn");
            }
            answer = rny_string;
        }
        return answer;
    }
}