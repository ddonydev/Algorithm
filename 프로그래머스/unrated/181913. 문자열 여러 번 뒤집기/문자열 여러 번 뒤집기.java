class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            String tmp = my_string.substring(queries[i][0], queries[i][1] + 1);
            StringBuffer sb = new StringBuffer(tmp);
            String reverse = sb.reverse().toString();
            my_string = my_string.substring(0, queries[i][0]) + reverse + my_string.substring(queries[i][1] + 1);
        }
        return my_string;
    }
}