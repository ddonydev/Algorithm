class Solution {
    public int solution(String myString, String pat) {
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
        
        return tmp.contains(pat) ? 1 : 0;
    }
}