class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
    
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(computers[i][j] == 1 && !visited[i]){
                    dfs(n, computers, i);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public void dfs(int n, int[][] computers, int current){
        if(visited[current]){
            return;
        }
        
        visited[current] = true;
        for(int i = 0; i < n; i++){
            if(computers[current][i] == 1 && current != i){
                dfs(n, computers, i);
            }
        }
    }
}