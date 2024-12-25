import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]");

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if(str[i] != null && !str[i].equals("")){
                list.add(str[i]);
            }
        }
        
        if(list.size() > 0){
            return list.toArray(String[]::new);
        }else{
            return new String[]{"EMPTY"};
        }
    }
}