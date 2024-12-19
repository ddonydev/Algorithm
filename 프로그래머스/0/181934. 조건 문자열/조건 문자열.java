import java.util.*;
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        HashMap<String, Boolean> map = new HashMap<>();
        map.put(">=", n >= m);
        map.put("<=", n <= m);
        map.put(">!", n > m);
        map.put("<!", n < m);
        
        return map.get(ineq + eq) ? 1 : 0;
    }
}