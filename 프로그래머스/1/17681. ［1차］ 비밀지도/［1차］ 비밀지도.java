import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int len1 = Integer.toBinaryString(arr1[i]).length();
            if (len1 != n) {
                int len = n - len1;
                String tmp = "";
                for (int j = 1; j <= len; j++) {
                    tmp += "0";
                }
                list1.add(tmp + Integer.toBinaryString(arr1[i]));
            }else{
                list1.add(Integer.toBinaryString(arr1[i]));
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            int len2 = Integer.toBinaryString(arr2[i]).length();
            if (len2 != n) {
                int len = n - len2;
                String tmp = "";
                for (int j = 1; j <= len; j++) {
                    tmp += "0";
                }
                list2.add(tmp + Integer.toBinaryString(arr2[i]));
            }else{
                list2.add(Integer.toBinaryString(arr2[i]));
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            String tmp = "";
            for (int j = 0; j < list1.get(i).length(); j++) {
                if(list1.get(i).charAt(j) == '1' && list2.get(i).charAt(j) == '0'){
                    tmp += "1";
                } else if (list1.get(i).charAt(j) == '0' && list2.get(i).charAt(j) == '1') {
                    tmp += "1";
                } else if(list1.get(i).charAt(j) == '1' && list2.get(i).charAt(j) == '1'){
                    tmp += "1";
                }else {
                    tmp += "0";
                }
            }
            result.add(tmp);
        }

        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            String tmp = "";
            for (int j = 0; j < result.get(i).length(); j++) {
                if (result.get(i).charAt(j) == '0') {
                    tmp += " ";
                } else {
                    tmp += "#";
                }
            }
            answer[i] = tmp;
        }
        return answer;
    }
}