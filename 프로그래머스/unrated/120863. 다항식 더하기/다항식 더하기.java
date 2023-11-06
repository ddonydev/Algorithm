class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" [+] ");

        int first = 0;
        int second = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("x")) {
                if (!str[i].equals("x")) {
                    String[] s = str[i].split("x");
                    first += Integer.parseInt(s[0]);
                }else{
                    first++;
                }
            }else{
                second += Integer.parseInt(str[i]);
            }
        }
        
        String answer = "";
        if (first == 0) {
            answer = String.valueOf(second);
        } else if(first != 1 && second == 0){
            answer = String.valueOf(first) + "x";
        } else if (first == 1 && second != 0) {
            answer = "x" + " + " + String.valueOf(second);
        } else if (first == 1 && second == 0) {
            answer = "x";
        } else{
            answer = String.valueOf(first) + "x" + " + " + String.valueOf(second);
        }

        return answer;
    }
}