import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        BigInteger x = BigInteger.valueOf(1);
        for (int i = 1; i <= balls; i++) {
            x = x.multiply(new BigInteger(String.valueOf(i)));
        }

        int tmp = balls - share;
        BigInteger y = BigInteger.valueOf(1);

        for (int i = 1; i <= tmp; i++) {
            y = y.multiply(new BigInteger(String.valueOf(i)));
        }

        BigInteger z = BigInteger.valueOf(1);
        for (int i = 1; i <= share; i++) {
            z = z.multiply(new BigInteger(String.valueOf(i)));
        }

        BigInteger a = y.multiply(z);

        return Integer.parseInt(String.valueOf(x.divide(a)));
    }
}