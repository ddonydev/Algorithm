class Solution {
    public int solution(int[][] dots) {
        int x_max = dots[0][0];
        int x_min = dots[0][0];

        int y_max = dots[0][1];
        int y_min = dots[0][1];

        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                if (x_max < dots[i][0]) {
                    x_max = dots[i][0];
                }

                if (y_max < dots[i][1]) {
                    y_max = dots[i][1];
                }
            }
            for (int j = 0; j < dots[i].length; j++) {
                if (x_min > dots[i][0]) {
                    x_min = dots[i][0];
                }

                if (y_min > dots[i][1]) {
                    y_min = dots[i][1];
                }
            }
            
        }

        int answer = (x_max - x_min) * (y_max - y_min);
        return answer;
    }
}