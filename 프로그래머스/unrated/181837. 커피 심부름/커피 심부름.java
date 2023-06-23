class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        int americano = 4500;
        int cafelatte = 5000;
        
        for(int i = 0; i < order.length; i++){
            if(order[i].equals("iceamericano") || order[i].equals("americanoice") || order[i].equals("hotamericano") || order[i].equals("americanohot") || order[i].equals("americano")){
                answer += 4500;
            }else if(order[i].equals("anything")){
                answer += 4500;
            }else{
                answer += 5000;
            }
        }
        
        return answer;
    }
}