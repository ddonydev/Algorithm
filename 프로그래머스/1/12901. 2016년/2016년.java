import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        LocalDate date = LocalDate.of(2016, a, b);
        int result = date.getDayOfWeek().ordinal();
        
        return days[result];
    }
}