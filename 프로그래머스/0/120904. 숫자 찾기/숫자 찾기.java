class Solution {
    public int solution(int num, int k) {
        String tmp = Integer.toString(num);
        String kNum = Integer.toString(k);
        
        return tmp.contains(kNum) ? tmp.indexOf(kNum) + 1 : tmp.indexOf(kNum);
    }
}