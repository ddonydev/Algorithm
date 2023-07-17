class Solution {
    public String solution(String code) {
        String answer = "";
        
        String[] arr = code.split("");
        int mode = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(mode == 0){
                if((i % 2 == 0) && (!arr[i].equals("1"))){
                    answer += arr[i];
                }else if(arr[i].equals("1")){
                    mode = 1;
                }
            }else{
                if((i % 2 != 0) && (!arr[i].equals("1"))){
                    answer += arr[i];
                }else if(arr[i].equals("1")){
                    mode = 0;
                }
            }
        }
        
        if(answer.isEmpty()){
            return "EMPTY";
        }
        
        return answer;
    }    
}