class Solution {
    public int solution(int[] numbers, int k) {
        int curr = 0;
        int cnt = 0;
        while(cnt != k){
            int index = 0;
            for(int i = curr; i < numbers.length; i += 2){
                cnt++;
                if(cnt == k){
                    return numbers[i];
                }
                index = i + 2;
            }
            if(index > numbers.length){
                index = 1;
            }
            curr = index;
        }
        return 0;
    }
}