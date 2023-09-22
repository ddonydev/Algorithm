class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");

        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);

        String[] tmp = new String[2];

        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) > max) {
                max = Integer.parseInt(str[i]);
            }
            if(Integer.parseInt(str[i]) < min){
                min = Integer.parseInt(str[i]);
            }
            tmp[0] = String.valueOf(min);
            tmp[1] = String.valueOf(max);
        }

        return tmp[0] + " " + tmp[1];
    }
}