class Solution {
    public int solution(int[] common) {
        int mul = 0;
        if(common[0] != 0){
            mul = common[1] / common[0];    
        }
    
        int sub = common[1] - common[0];
        if(mul * common[common.length - 2] == common[common.length - 1]){
            return common[common.length - 1] * mul;
        }else{
            return common[common.length - 1] + sub;
        }
    }
}