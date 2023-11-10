import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int h = 0;
        for (int i = 0; i <= citations.length; i++) {
            int journal = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) {
                    journal++;
                }
            }

            if (journal >= i) {
                h = i;
            }
        }
        return h;
    }
}