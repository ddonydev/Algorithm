class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);

        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();

        return Integer.parseInt(reverse, 3);
    }
}