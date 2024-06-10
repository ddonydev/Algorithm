class Solution {
    public String solution(String phone_number) {
        String arr = phone_number.substring(0, phone_number.length() - 4);
        arr = arr.replaceAll("[0-9]", "*");
        return arr + phone_number.substring(phone_number.length() - 4);
    }
}