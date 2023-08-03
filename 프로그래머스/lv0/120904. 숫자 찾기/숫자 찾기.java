class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String tmp = Integer.toString(num);
        String kNum = Integer.toString(k);

        if(tmp.contains(kNum)){
            answer = tmp.indexOf(kNum) + 1;
        }else {
            answer = tmp.indexOf(kNum);
        }
        
        return answer;
    }
}