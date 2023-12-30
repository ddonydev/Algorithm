import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        String[] tmp = skill.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp[i], i + 1);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < skill_trees.length; i++) {
            String[] str = skill_trees[i].split("");
            for (int j = 0; j < str.length; j++) {
                if (map.containsKey(str[j])) {
                    queue.add(map.get(str[j]));
                }
            }

            int index = 1;
            boolean flag = true;
            while (!queue.isEmpty()) {
                int num = queue.poll();
                if (num != index) {
                    flag = false;
                    break;
                }
                index++;
            }

            queue.clear();

            if (flag) {
                answer++;
            }
        }
        
        return answer;
    }
}