class Solution {
    public int solution(int[] num_list) {

        int multiple = 1;
        int sum = 0;
        
        for(int i : num_list){
            multiple *= i;
            sum += i;
        }
        
        sum = (int)Math.pow(sum, 2);
        
        return multiple < sum ? 1 : 0;
    }
}