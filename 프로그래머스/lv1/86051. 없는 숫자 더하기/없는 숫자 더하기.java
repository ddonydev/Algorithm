import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            arr.add(numbers[i]);
        }

        List<Integer> result = list.stream().filter(old -> arr.stream()
                                                    .noneMatch(Predicate.isEqual(old)))
                        .collect(Collectors.toList());

        for (int i = 0; i < result.size(); i++) {
            answer += result.get(i);
        }
        return answer;
    }
}