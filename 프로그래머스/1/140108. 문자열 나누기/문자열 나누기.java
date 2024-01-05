class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = s.split("");
        
        String x = str[0];
        int x_cnt = 0;
        int y_cnt = 0;
        
        for(int i = 0; i < str.length; i++){
            if(x.equals(str[i])){
                x_cnt++;
            }else{
                y_cnt++;
            }

            if(x_cnt == y_cnt){
                answer++;
                x_cnt = 0;
                y_cnt = 0;
                if(i + 1 == str.length){
                    continue;
                }else{
                    x = str[i + 1];
                }
            } else if (x_cnt != y_cnt && i == str.length - 1) {
                answer++;
            }
        }
        
        return answer;
    }
}