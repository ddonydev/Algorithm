package Level0;

import java.util.Arrays;

public class level0_14 {

    class Solution {
        public int solution(int[] array) {
            int answer = 0;

            Arrays.sort(array);

            return array[array.length/2];


        }
    }

}
