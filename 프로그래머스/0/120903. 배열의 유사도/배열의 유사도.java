import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> list1 = Arrays.asList(s1);
        List<String> list2 = Arrays.asList(s2);

         return (int) list1.stream()
                .filter(list2::contains)
                .count();
       
    }
}