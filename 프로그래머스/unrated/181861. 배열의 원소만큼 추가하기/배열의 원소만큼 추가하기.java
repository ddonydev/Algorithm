class Solution {
    public int[] solution(int[] arr) { 
        int x = 0;
        
        for(int i : arr){
            x += i;
        }
        
        int[] answer = new int[x];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j <= arr[i]; j++){
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}