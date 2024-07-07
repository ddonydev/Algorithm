class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        
        int odd_loc = 1;
        int even_loc = 1;
        for(int i = num_list.length - 1; i >= 0; i--){
            if(num_list[i] % 2 == 0){
                even += even_loc * num_list[i];
                even_loc *= 10;
            }else{
                odd += odd_loc * num_list[i];
                odd_loc *= 10;
            }
        }
        return odd + even;
    }
}