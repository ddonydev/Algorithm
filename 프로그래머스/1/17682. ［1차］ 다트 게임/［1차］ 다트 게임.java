import java.util.*;
class Solution {
    public int solution(String dartResult) {
        String[] dartStr = dartResult.split("");

        Map<String, Integer> map = new HashMap<>();
        map.put("S", 1);
        map.put("D", 2);
        map.put("T", 3);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < dartStr.length; i++){
            if(dartStr[i].matches("[0-9]")){
                if(dartStr[i + 1].matches("[0-9]")){
                    String str = dartStr[i] + dartStr[i + 1];
                    list.add(Integer.parseInt(str));
                    i += 1;
                }else {
                    list.add(Integer.parseInt(dartStr[i]));
                }
            }else {
                String ch = dartStr[i];
                int num = list.get(list.size() - 1);
                if(ch.equals("S") || ch.equals("D") || ch.equals("T")){
                    num = (int) Math.pow(num, map.get(ch));
                }else if (dartStr[i].equals("*")) {
                    num *= 2;
                    if (list.size() > 1) {
                        int n = list.get(list.size() - 2);
                        n *= 2;
                        list.set(list.size() - 2, n);
                    }
                }else if(dartStr[i].equals("#")) {
                    num *= -1;
                }
                list.set(list.size() - 1, num);
            }
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}