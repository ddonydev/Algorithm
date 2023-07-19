import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        
        BigInteger first = new BigInteger(a);
        BigInteger second = new BigInteger(b);

        BigInteger add = second.add(first);
        
        String answer = add.toString();
        
        return answer;
    }
}