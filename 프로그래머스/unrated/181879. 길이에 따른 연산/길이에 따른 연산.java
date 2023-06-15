class Solution {
    public int solution(int[] num_list) {
        
        int sum = 0;
        int multiple = 1;
        
        for(int i = 0; i < num_list.length; i++){
                sum += num_list[i];
                multiple *= num_list[i]; 
        }
        
        if(num_list.length >= 11){
            return sum;
        }else{
             return multiple;
        }
        
        
    }
}