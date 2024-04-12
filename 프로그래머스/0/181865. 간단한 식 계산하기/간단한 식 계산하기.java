class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        

        if(str[1].contains("+")){
            return num1 + num2;
        }else if(str[1].contains("-")){
            return num1 - num2;
        }else{
            return num1 * num2;
        }
        
    }
}