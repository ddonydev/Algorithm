class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;

        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase("p")){
                p++;
            }
            if(arr[i].equalsIgnoreCase("y")){
                y++;
            }
        }

        boolean answer;

        if (p == y) {
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}