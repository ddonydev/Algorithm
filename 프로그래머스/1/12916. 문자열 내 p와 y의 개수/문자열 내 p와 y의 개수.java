import java.util.*;
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        if(!s.contains("p") && !s.contains("y")){
            return true;
        }
        
        int pCnt = 0;
        int yCnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p'){
                pCnt++;
            }
            if(s.charAt(i) == 'y'){
                yCnt++;
            }
        }
        
        return pCnt == yCnt ? true : false;

    }
}