class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int cnt = 0;

        int index = 0;
        int hp = health;

        while (time < attacks[attacks.length - 1][0]) {
            time++;
            if(time == attacks[index][0]){
                hp -= attacks[index][1];
                ++index;
                cnt = 0;
            }else{
                hp += bandage[1];
                ++cnt;
                if (cnt == bandage[0]) {
                    hp += bandage[2];
                    cnt = 0;
                }
                if (hp >= health) {
                    hp = health;
                    cnt = 0;
                }
            }
            if (hp <= 0) {
                return -1;
            }
        }
        return hp;
    }
}