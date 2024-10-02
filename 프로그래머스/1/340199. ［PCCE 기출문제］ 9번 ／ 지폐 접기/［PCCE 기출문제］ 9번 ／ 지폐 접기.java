import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while(bill[0] > wallet[0] || bill[1] > wallet[1]){
            if(bill[0] > bill[1]){
                if(bill[0] % 2 != 0){
                    bill[0] =(int) Math.floor(bill[0] / 2);
                }else{
                    bill[0] /= 2;
                }
            }else if(bill[0] < bill[1]){
                if(bill[1] % 2 != 0){
                    bill[1] = (int) Math.floor(bill[1] / 2);
                }else{
                    bill[1] /= 2;
                }
            }
            Arrays.sort(bill);
            answer++;
        }
        return answer;
    }
}