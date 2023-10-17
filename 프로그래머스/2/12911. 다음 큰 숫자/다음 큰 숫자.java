class Solution {
    public int solution(int n) {
        String binary_n = Integer.toBinaryString(n);
        int n_cnt = 0;

        for (int i = 0; i < binary_n.length(); i++) {
            if (binary_n.charAt(i) == '1') {
                n_cnt++;
            }
        }

        n++;

        int cnt = 0;
        int answer = 0;
        while (n_cnt != cnt) {
            cnt = 0;
            String binaryString = Integer.toBinaryString(n);
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '1') {
                    cnt++;
                }
            }
            answer = Integer.parseInt(binaryString, 2);
            n++;
        }
        return answer;
    }
}