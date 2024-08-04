class Solution {
    public String solution(String bin1, String bin2) {
        int s1 = Integer.parseInt(bin1, 2);
        int s2 = Integer.parseInt(bin2, 2);

        int result = s1 + s2;

        return Integer.toBinaryString(result);
    }
}