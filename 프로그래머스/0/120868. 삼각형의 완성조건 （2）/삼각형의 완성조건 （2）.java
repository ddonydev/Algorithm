class Solution {
    public int solution(int[] sides) {
        int sum = sides[0] + sides[1];

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int cnt = 0;
        
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