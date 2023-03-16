class Solution {
    public int solution(String my_string) {
        
        String extract = my_string.replaceAll("[^0-9]", "");
        String[] split = extract.split("");

        int num = 0;

        for(int i = 0; i < split.length; i++){
            num += Integer.parseInt(split[i]);
        }
        
        return num;
        
    }
}