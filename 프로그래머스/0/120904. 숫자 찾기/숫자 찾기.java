class Solution {
    public int solution(int num, int k) {
        String tmp = Integer.toString(num);
        String kNum = Integer.toString(k);

        if(tmp.contains(kNum)){
            return tmp.indexOf(kNum) + 1;
        }else {
            return tmp.indexOf(kNum);
        }
        
    }
}