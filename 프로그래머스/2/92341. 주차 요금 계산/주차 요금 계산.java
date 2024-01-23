import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>();
        Map<String, Integer> cost = new HashMap<>();
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            String[] time = record[0].split(":");
            if (record[2].equals("IN")) {
                parking.put(record[1], parking.getOrDefault(record[1], 0) + Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]));
            } else if (record[2].equals("OUT")) {
                parking.put(record[1], Math.abs(parking.get(record[1]) - (Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]))));
                cost.put(record[1], cost.getOrDefault(record[1], 0) + parking.get(record[1]));
                parking.remove(record[1]);
            }
        }
        List<String> parkingKey = new ArrayList<>(parking.keySet());
        for (String s : parkingKey) {
            cost.put(s, cost.getOrDefault(s, 0) + Math.abs(parking.get(s) - ((23 * 60) + 59)));
            parking.remove(s);
        }

        List<String> keySet = new ArrayList<>(cost.keySet());
        Collections.sort(keySet);

        int[] answer = new int[cost.size()];
        for (int i = 0; i < keySet.size(); i++) {
            int time = cost.get(keySet.get(i));
            int result = fees[1];
            if (time > fees[0]) {
                double cal = Math.ceil((double) (time - fees[0]) / fees[2]);
                result += cal * fees[3];
            }
            answer[i] = result;
        }
        return answer;
    }
}