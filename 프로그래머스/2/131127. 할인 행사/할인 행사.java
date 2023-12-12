import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        List<String> wantList = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i]; j++) {
                wantList.add(want[i]);
            }
        }

        Collections.sort(wantList);

        int answer = 0;
        for (int i = 0; i < discount.length - 9; i++) {
            int cnt = 0;
            String[] newDiscount = Arrays.copyOfRange(discount, i, i + 10);
            Arrays.sort(newDiscount);
            for (int j = 0; j < wantList.size(); j++) {
                if (wantList.get(j).equals(newDiscount[j])) {
                    cnt++;
                }else {
                    break;
                }
            }
            if (cnt == wantList.size()) {
                answer++;
            }
        }
        return answer;
    }
}