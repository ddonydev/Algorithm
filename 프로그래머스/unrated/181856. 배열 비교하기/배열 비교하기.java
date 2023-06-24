class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int ar1 = 0;
        int ar2 = 0;
        
        for(int i : arr1){
            ar1 += i;
        }
        
        for(int i : arr2){
            ar2 += i;
        }
        
        if(arr1.length > arr2.length || (arr1.length == arr2.length && ar1 > ar2)){
            answer = 1;
        }else if(arr1.length < arr2.length || arr1.length == arr2.length && ar1 < ar2){
            answer = -1;
        }else{
            answer = 0;
        }      
          
        return answer;
    }
}