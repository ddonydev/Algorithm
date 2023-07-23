class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int f = 0;
        int s = 0;
        for (int i = 0; i < queries.length; i++) {
            f = queries[i][0];
            s = queries[i][1];

            for(int j = f; j <= s; j++){
                arr[j] += 1;
            }
        }
        
        return arr;
    }
}