class Solution {
    public boolean solution(int x) {
        String strNum = Integer.toString(x);
        int[] arrNum = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            arrNum[i] = strNum.charAt(i) - '0';
        }

        int num = 0;
        for (int i = 0; i < arrNum.length; i++) {
            num += arrNum[i];
        }
        return x % num == 0 ? true : false;
    }
}