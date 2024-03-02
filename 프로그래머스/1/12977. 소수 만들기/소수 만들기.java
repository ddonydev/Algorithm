import java.util.*;
class Solution {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    list.add(sum);
                }
            }
        }

        int max = Collections.max(list);

        Set<Integer> set = new HashSet<>();

        int cnt = 0;
        for (int i = 2; i <= max; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                set.add(i);
            }
                cnt = 0;
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                answer++;
            }
        }

        return answer;
    }
}