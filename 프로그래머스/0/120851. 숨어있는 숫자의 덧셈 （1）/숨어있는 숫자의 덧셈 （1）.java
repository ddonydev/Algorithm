class Solution {
    public int solution(String my_string) {
        
        String extract = my_string.replaceAll("[^0-9]", "");
        String[] str = extract.split("");

        int num = 0;

        for(int i = 0; i < str.length; i++){
            num += Integer.parseInt(str[i]);
        }
        
        return num;
        
    }
}