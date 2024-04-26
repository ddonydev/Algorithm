class Solution {
    public String[] solution(String my_str, int n) {
        int len = 0;
        if(my_str.length() % n == 0){
            len = my_str.length() / n;
        }else{
            len = (my_str.length() / n) + 1;
        }
        
        String[] answer = new String[len];
        int index = 0;

        String str = "";
        for(int i = 0; i < my_str.length(); i++){
            str += my_str.charAt(i);
            if(i == my_str.length() - 1 || str.length() == n){
                answer[index++] = str;
                str = "";
            }
        }
        
        return answer;
    }
}