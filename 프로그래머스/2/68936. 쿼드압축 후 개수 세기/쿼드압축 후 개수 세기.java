class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        slice(arr, 0, 0, arr.length);
        return answer;
    }
    
    void slice(int[][] arr, int x, int y, int len) {
        if (len == 1) {
            int num = arr[x][y];
            answer[num]++;
            return;
        }

        if (check(arr, x, y, len)) {
            return;
        }

        int newLen = len / 2;
        slice(arr, x, y, newLen);
        slice(arr, x, y + newLen, newLen);
        slice(arr, x + newLen, y, newLen);
        slice(arr, x + newLen, y + newLen, newLen);
    }
    
    boolean check(int[][] arr, int x, int y, int len) {
        boolean flag = true;
        int n = arr[x][y];

        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (n != arr[i][j]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            answer[n]++;
        }
        return flag;
    }
}