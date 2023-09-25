class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1];

        int max = 0;
        int min = 0;
        int cnt = 0;

        if(sides[0] > sides[1]){
            max = sides[0];
            min = sides[1];
        }else{
            max = sides[1];
            min = sides[0];
        }

        for (int i = 1; i <= max; i++) {
            if(min + i > max){
                cnt++;
            }
        }

        for (int i = 1; i <= sum; i++) {
            if(i > max && i < sum){
                cnt++;
            }
        }

        return cnt;
    }
}