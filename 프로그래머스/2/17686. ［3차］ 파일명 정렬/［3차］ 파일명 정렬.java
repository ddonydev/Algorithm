import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];

                int result = head1.compareToIgnoreCase(head2);

                if (result == 0) {
                    result = convertNum(o1, head1) - convertNum(o2, head2);
                }
                return result;
            }
        });
        return files;
    }
    
    public int convertNum(String s, String head1) {
        s = s.substring(head1.length());
        String result = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && result.length() < 5) {
                result += c;
            } else {
                break;
            }
        }
        return Integer.parseInt(result);
    }
}