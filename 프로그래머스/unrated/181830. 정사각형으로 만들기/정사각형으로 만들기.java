class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        
        int row = arr.length;
        int column = arr[0].length;
        
        if(row > column){
            answer = new int[row][row];
        }else{
            answer = new int[column][column];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}