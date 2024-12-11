class Solution {
    public int[] solution(String s) {
        String tmp = "";
        int cnt = 0;
        int remove = 0;
        while (!s.equals("1")) {
            int len = s.length();
            s = s.replaceAll("0", "");
            remove += len - s.length();
            s = Integer.toBinaryString(s.length());
            cnt++;
        }

        return new int[]{cnt, remove};
    }
}