class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String tmp = "";
        
        String[] arr = myString.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("A")){
                arr[i] = arr[i].replace("A", "B");
            }else{
                arr[i] = arr[i].replace("B", "A");
            }
            tmp += arr[i];
        }

        if(tmp.contains(pat)){
            answer = 1;
        }else {
            answer = 0;
        }
        
        return answer;
    }
}