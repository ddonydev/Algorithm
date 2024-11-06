import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> giftIndex = new LinkedHashMap<>();
        HashMap<String, Integer> giftsMap = new LinkedHashMap<>();

        for(String friend : friends){
            giftIndex.put(friend, 0);
        }

        for(String gift : gifts){
            String[] arr = gift.split(" ");
            giftIndex.put(arr[0], giftIndex.get(arr[0]) + 1);
            giftIndex.put(arr[1], giftIndex.get(arr[1]) - 1);
            giftsMap.put(gift, giftsMap.getOrDefault(gift, 0) + 1);
        }

        int[] giftForNextMonth = new int[friends.length];
        for(int i = 0; i < friends.length; i++){
            for(int j = i+1; j < friends.length; j++){
                String A = friends[i] + " " + friends[j];
                String B = friends[j] + " " + friends[i];
                int cntA = giftsMap.containsKey(A) ? giftsMap.get(A) : 0;
                int cntB = giftsMap.containsKey(B) ? giftsMap.get(B) : 0;

                if(cntA == cntB){
                    int scoreA = giftIndex.get(friends[i]);
                    int scoreB = giftIndex.get(friends[j]);
                    if(scoreA != scoreB){
                        giftForNextMonth[scoreA > scoreB ? i : j]++;
                    }
                } else {
                    giftForNextMonth[cntA > cntB ? i : j]++;
                }
            }
        }

        int answer = 0;
        for(int i : giftForNextMonth){
            answer = Math.max(answer, i);
        }
        return answer;
    }
}