import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Item> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            Item item = new Item(priorities[i], i);
            queue.add(item);
        }


        int cnt = 0;
        int answer = 0;
        while (!queue.isEmpty()) {
            boolean flag = false;
            Item current = queue.poll();
            for (Item val : queue) {
                if (current.priority < val.priority) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                queue.offer(current);
            }else{
                cnt++;
                if (current.index == location) {
                    answer = cnt;
                    break;
                }
            }
        }
        return answer;
    }
    
    static class Item {
        int priority;
        int index;

        public Item(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}