class Solution {
    public int solution(String my_string) {
        
        my_string = my_string.replaceAll("[^0-9]", "");

        return my_string.chars().map(c -> c - '0').sum();
        
    }
}