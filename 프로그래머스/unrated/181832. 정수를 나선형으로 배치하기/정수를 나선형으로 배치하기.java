class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int[] dx = {
            0, 0, -1, 1
        };
        int[] dy = {
            -1, 1, 0, 0
        };
        
        int direction = 3;
        
        int x = 0;
        int y = 0;
        
        int num = 1;
        while(num < n * n){
            answer[y][x] = num;
            int ny = y + dy[direction];
            int nx = x + dx[direction];

            if(ny < 0){
                direction = 3;
                continue;
            }

            if(nx < 0) {
                direction = 0;
                continue;
            }

            if(ny >= n) {
                direction = 2;
                continue;
            }

            if(nx >= n) {
                direction = 1;
                continue;
            }
            
            if(answer[ny][nx] != 0 && direction == 0){
                direction = 3;
                continue;
            }

            if (answer[ny][nx] != 0 && direction == 2) {
                direction = 0;
                continue;
            }

            if (answer[ny][nx] != 0 && direction == 1) {
                direction = 2;
                continue;
            }
            if (answer[ny][nx] != 0 && direction == 3) {
                direction = 1;
                continue;
            }
            num++;
            y = ny;
            x = nx;
            
        }
        answer[y][x] = num;
        return answer;
    }
}