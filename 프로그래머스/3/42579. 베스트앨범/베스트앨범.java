import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> total = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            total.put(genres[i], total.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> genre = new ArrayList<>();
        for(String key : total.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> total.get(o2) - total.get(o1));

        Map<Integer, Integer> times = new HashMap<>();
        for (int i = 0; i < plays.length; i++) {
            times.put(i, plays[i]);
        }

        List<Integer> list = new ArrayList<>(times.keySet());
        Collections.sort(list, ((o1, o2) -> times.get(o2) - times.get(o1)));

        List<Integer> result = new ArrayList<>();
        for (String s : genre) {
            int cnt = 1;
            for (int i : list) {
                if (genres[i].equals(s) && cnt < 3) {
                    cnt++;
                    result.add(i);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}