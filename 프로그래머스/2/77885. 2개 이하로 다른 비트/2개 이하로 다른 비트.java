class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
            }else{
                String str = Long.toBinaryString(numbers[i]);
                int index = str.lastIndexOf("0");
                if (index != -1){
                    str = str.substring(0, index) + "10" + str.substring(index + 2);
                    answer[i] = Long.parseLong(str, 2);
                }else{
                    str = "10" + str.substring(1);
                    answer[i] = Long.parseLong(str, 2);
                }
            }
        }
        return answer;
    }
}