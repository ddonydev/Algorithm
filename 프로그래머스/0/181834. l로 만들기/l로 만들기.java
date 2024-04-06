class Solution {
    public String solution(String myString) {
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) < 108){
                myString = myString.replace(myString.charAt(i), 'l');
            }
        }
        return myString;
    }
}