import java.util.*;
class Solution {
    public int[] solution(String msg) {
        char word = 'A';

        Map<String, Integer> dic = new HashMap<>();
        for(int i = 1; i <= ('Z' - 'A') + 1; i++){
            dic.put(word + "", i);
            word += 1;
        }

        int lastVal = dic.get("Z");

        List<Integer> list = new ArrayList();
        String[] msgArr = msg.split("");

        int index = 0;
        while (index < msgArr.length){
            String s = "";
            while (index < msgArr.length){
                if(!dic.containsKey(s + msgArr[index])){
                    break;
                }else{
                    s += msgArr[index];
                }
                index ++;
            }
            list.add(dic.get(s));

            if(index < msgArr.length){
                dic.put(s + msgArr[index], lastVal += 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}