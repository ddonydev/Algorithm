import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length){
            return 1;
        }else if(arr1.length < arr2.length){
            return -1;
        }else{
            int ar1 = Arrays.stream(arr1).sum();
            int ar2 = Arrays.stream(arr2).sum();
            
            if(ar1 > ar2){
                return 1;
            }else if(ar1 < ar2){
                return -1;
            }else{
                return 0;
            }
        }
    }
}