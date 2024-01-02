class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[] dx = {
            -1, 0, 1,
            -1, 0, 1,
            -1, 0, 1
        };
        int[] dy = {
            -1, -1, -1,
            0, 0, 0,
            1, 1, 1
        };
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    for(int k = 0; k < 9; k++){
                        int nx = dx[k] + j;
                        int ny = dy[k] + i;
                        try{
                            if(board[ny][nx] != 1){
                                board[ny][nx] = 2;
                            }
                        }catch(Exception e){
                            
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}