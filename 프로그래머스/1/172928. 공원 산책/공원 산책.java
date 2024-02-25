class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        int width = park[0].length();
        int height = park.length;

        int[] answer = new int[2];

        String[][] parks = new String[height][width];
        for (int i = 0; i < park.length; i++) {
            String[] p = park[i].split("");
            for (int j = 0; j < p.length; j++) {
                parks[i][j] = p[j];
                if (p[j].equals("S")) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        for (String route : routes) {
            String[] r = route.split(" ");
            int len = Integer.parseInt(r[1]);
            x = answer[1];
            y = answer[0];
            for (int i = 0; i < len; i++) {
                if (r[0].equals("E")) {
                    x++;
                } else if (r[0].equals("W")) {
                    x--;
                } else if (r[0].equals("N")) {
                    y--;
                } else if (r[0].equals("S")) {
                    y++;
                }

                if(x >=0 && y >=0 && y < parks.length && x < parks[0].length){
                    if(parks[y][x].equals("X")){
                        break;
                    }
                    if(i == len - 1){
                        answer[0] = y;
                        answer[1] = x;
                    }
                }

            }
        }
        return answer;
    }
}