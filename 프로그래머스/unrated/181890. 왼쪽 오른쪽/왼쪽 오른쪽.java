import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};

        List<String> str = new ArrayList<>(Arrays.asList(str_list));
        List<String> list = new ArrayList<>();

        if(str.contains("l") && str.contains("r")){
            int l = str.indexOf("l");
            int r = str.indexOf("r");

            if(l < r){
                for (int i = 0; i < l; i++) {
                    list.add(str.get(i));
                }
            }else{
                for (int i = r + 1; i < str.size(); i++) {
                    list.add(str.get(i));
                }
            }
        }else if(str.contains("l") && !str.contains("r")){
            int l = str.indexOf("l");
            for (int i = 0; i < l; i++) {
                list.add(str.get(i));
            }
        }else if(!str.contains("l") && str.contains("r")){
            int r = str.indexOf("r");
            for (int i = r + 1; i < str.size(); i++) {
                list.add(str.get(i));
            }
        }else{
            list.add("");
        }

        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == ""){
                answer = new String[]{};
                break;
            }
            answer[i] = list.get(i);
        }
        return answer;
    }
}