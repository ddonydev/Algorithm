class Solution {
    public String solution(String p) {
        String answer = "";
        if(isCorrect(p)){
            answer = p;
        }else{
            answer = makeCorrect(p);
        }
        return answer;
    }
    static boolean isCorrect(String p) {
        int open = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                open++;
            } else if (p.charAt(i) == ')') {
                open--;
            }

            if (open < 0) {
                return false;
            }
        }

        return true;
    }

    static String makeCorrect(String str) {
        if (str.equals("")) {
            return str;
        }

        int open = 0;
        int close = 0;
        String u = "";
        String v = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else if (str.charAt(i) == ')') {
                close++;
            }

            if (open == close) {
                u = str.substring(0, i + 1);
                v = str.substring(i + 1);

                if (isCorrect(u)) {
                    return u + makeCorrect(v);
                } else {
                    String result = "(" + makeCorrect(v) + ")";
                    for (int j = 1; j < u.length() - 1; j++) {
                        if (u.charAt(j) == '(') {
                            result += ")";
                        } else if (u.charAt(j) == ')') {
                            result += "(";
                        }
                    }
                    return result;
                }
            }
        }
        return "";
    }
}

