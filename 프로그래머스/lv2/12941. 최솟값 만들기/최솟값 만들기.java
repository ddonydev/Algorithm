import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            aList.add(A[i]);
            bList.add(B[i]);
        }

        int answer = 0;
        for (int i = 0; i < aList.size(); i++) {
            answer += aList.get(i) * bList.get((bList.size() -1) - i);
        }

        return answer;
    }
}