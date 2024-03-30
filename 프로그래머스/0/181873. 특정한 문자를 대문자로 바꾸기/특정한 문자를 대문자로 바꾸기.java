class Solution {
    public String solution(String my_string, String alp) {
        if(!my_string.contains(alp)){
            return my_string;
        }
        String answer = "";
        
        String[] str = my_string.split("");
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(alp)){
                str[i] = str[i].toUpperCase();
            }
            answer += str[i];
        }
        
        return answer;
    }
}