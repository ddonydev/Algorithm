class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);

        StringBuffer sb = new StringBuffer(s);

        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}