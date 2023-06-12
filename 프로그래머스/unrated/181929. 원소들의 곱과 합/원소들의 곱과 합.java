class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int sum = 0;
        
        for(int i : num_list){
            multiple *= i;
            sum += i;
        }
        
        sum = (int)Math.pow(sum, 2);
        
        if(multiple < sum){
            answer = 1;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}