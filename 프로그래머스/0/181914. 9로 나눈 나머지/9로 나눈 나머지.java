class Solution {
    public int solution(String number) {
        int tmp = 0;
        
        String[] str = number.split("");
        for(int i = 0; i < str.length; i++){
            tmp += Integer.parseInt(str[i]);
        }
        
        return tmp % 9; 
    }
}