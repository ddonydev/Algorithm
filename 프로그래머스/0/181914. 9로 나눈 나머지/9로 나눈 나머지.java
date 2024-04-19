class Solution {
    public int solution(String number) {
        int tmp = 0;
        
        for(int i = 0; i < number.length(); i++){
            tmp += number.charAt(i) - '0';
        }
        
        return tmp % 9; 
    }
}