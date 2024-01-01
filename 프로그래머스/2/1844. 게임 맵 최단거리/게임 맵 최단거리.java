import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        Queue<Item> queue = new LinkedList<>();
        queue.add(new Item(0, 0, 1));
        
        int[] dx = {
            0, 0, -1, 1
        };
        int[] dy = {
            -1, 1, 0, 0
        };
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        while(!queue.isEmpty()){
            Item current = queue.poll();
            if(current.x == maps[0].length - 1 && current.y == maps.length - 1){
                return current.distance;
            }
        
            for(int i = 0; i < 4; i++){
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= maps[0].length || ny >= maps.length){
                    continue;
                }
                if(visited[ny][nx]){
                    continue;
                }
                if(maps[ny][nx] == 0){
                    continue;
                }
                visited[ny][nx] = true;
                queue.add(new Item(nx, ny, current.distance + 1));
            } 
        }
        
        return -1;
    }
}

class Item{
    int x;
    int y;
    int distance;
    
    public Item(int x, int y, int distance){
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}