class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        
        switch(str[1]){
            case"+":
                return num1 + num2;
            case"-":
                return num1 - num2;
            case"*":
                return num1 * num2;
        }
        return 0;
        
    }
}