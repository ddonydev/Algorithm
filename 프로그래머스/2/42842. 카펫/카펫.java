class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int height = yellow / i;

                int border = (i * 2) + (height * 2) + 4;

                if (i >= height && border == brown) {
                    answer[0] = i + 2;
                    answer[1] = height + 2;
                    return answer;
                }
            }
        }
        return answer;
        
    }
}