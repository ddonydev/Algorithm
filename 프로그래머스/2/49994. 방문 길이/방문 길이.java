import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;

        HashSet<String> set = new HashSet<>();

        int[][] location = new int[2][2];

        for (int i = 0; i < dirs.length(); i++) {
            char direction = dirs.charAt(i);
            
            location[1][0] = location[0][0];
            location[1][1] = location[0][1];

            boolean flag = false;
            switch (direction) {
                case 'U':
                    location[0][1]++;
                    if (location[0][1] > 5) {
                        flag = true;
                        location[0][1] = 5;
                    }
                    break;
                case 'D':
                    location[0][1]--;
                    if (location[0][1] < -5) {
                        flag = true;
                        location[0][1] = -5;
                    }
                    break;
                case 'R':
                    location[0][0]++;
                    if (location[0][0] > 5) {
                        flag = true;
                        location[0][0] = 5;
                    }
                    break;
                case 'L':
                    location[0][0]--;
                    if (location[0][0] < -5) {
                        flag = true;
                        location[0][0] = -5;
                    }
                    break;
                default:
                    break;
            }

            if (flag)
                continue;

            set.add("" + location[0][0] + location[0][1] + location[1][0] + location[1][1]);
            set.add("" + location[1][0] + location[1][1] + location[0][0] + location[0][1]);
        }

        answer = set.size() / 2;
        return answer;
    }
}