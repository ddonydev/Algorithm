import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                sb.append(String.valueOf(Character.toLowerCase(str.charAt(i))));
            }else{
                sb.append(String.valueOf(Character.toUpperCase(str.charAt(i))));
            }

        }
        System.out.println(sb.toString());
    }
}