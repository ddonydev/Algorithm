import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Integer[] people_wrapper = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(people_wrapper, Collections.reverseOrder());

int left = 0;
        int right = people_wrapper.length - 1;

        while (left < right) {
            if (limit - people_wrapper[left] >= people_wrapper[right]) {
                right--;
            }
            left++;
        }

        if (left == right) {
            left++;
        }        
        return left;
    }
}