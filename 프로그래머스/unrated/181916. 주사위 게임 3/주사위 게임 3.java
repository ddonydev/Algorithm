import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : entryList){
            list.add(entry.getKey());
        }      
        
        if(map.containsValue(4)){
            answer = 1111 * list.get(0);
        }else if(map.containsValue(3)){
            int p = list.get(0);
            int q = list.get(1);
            
            answer = (10 * p + q) * (10 * p + q);
            
        }else if(map.containsValue(2) && map.size() == 2){
            answer = ((list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1)));
        }else if(map.containsValue(2) && map.size() == 3){
            for(int i = 0; i < list.size(); i++){
                if(map.get(list.get(i)) == 2){
                    list.remove(i);
                }
            }
            System.out.println(list);
            answer = list.get(0) * list.get(1);
        }else{
            Collections.sort(list);
            answer = list.get(0);
        }
        
        return answer;
    }
}