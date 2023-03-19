import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[^0-9]", "");

        String[] arr = num.split("");

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(newArr);
        
        return newArr;
    }
}