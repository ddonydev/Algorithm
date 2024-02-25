import java.util.*;
class Solution {
    public int[] solution(String[] info, String[] query) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (String i : info) {
            String[] str = i.split(" ");
            String[] lan = {str[0], "-"};
            String[] pos = {str[1], "-"};
            String[] exp = {str[2], "-"};
            String[] food = {str[3], "-"};
            int score = Integer.parseInt(str[4]);

            for (String l : lan) {
                for (String p : pos) {
                    for (String e : exp) {
                        for (String f : food) {
                            String[] key = {l, p, e, f};
                            String k = String.join(" ", key);
                            ArrayList<Integer> list = map.getOrDefault(k, new ArrayList<>());
                            list.add(score);

                            map.put(k, list);
                        }
                    }
                }
            }
        }

        for (String key : map.keySet()) {
            ArrayList<Integer> list = map.get(key);
            Collections.sort(list);
        }

        int[] answer = new int[query.length];
        int index = 0;
        for (String q : query) {
            String str = q.replace("and ", "");
            String sentence = str.substring(0, str.lastIndexOf(" "));
            int score = Integer.parseInt(str.substring(str.lastIndexOf(" ") + 1));

            if (map.containsKey(sentence)) {
                ArrayList<Integer> list = map.get(sentence);
                int left = 0;
                int right = list.size();
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) >= score) {
                        right = mid;
                    }else{
                        left = mid + 1;
                    }
                }
                answer[index] = list.size() - left;
            }
            index++;
        }
        return answer;
    }
}