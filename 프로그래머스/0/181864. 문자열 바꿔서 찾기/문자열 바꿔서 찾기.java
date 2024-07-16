class Solution {
    public int solution(String myString, String pat) {
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                myString = myString.substring(0, i) + "B" + myString.substring(i + 1);
            }else{
                myString = myString.substring(0, i) + "A" + myString.substring(i + 1);
            }
        }
        
        if(myString.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}