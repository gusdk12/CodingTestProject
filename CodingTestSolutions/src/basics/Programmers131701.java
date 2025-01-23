package basics;

import java.util.*;

public class Programmers131701 {
    public int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>(); //  중복 제거 된 수열 총합들

        int x = 1;
        // 수열 개수만큼 반복
        while(x <= elements.length) {
            //
            for(int i = 0; i < elements.length; i++){
                int sum = 0; // 수열 총합
                for(int j = i; j < i + x; j++){
                    // 해당 인덱스의 수열 더하기
                    sum += elements[j % elements.length];
                }
                // 총합들에 추가하기
                sums.add(sum);
            }
            x++;
        }
        return sums.size();
    }
}
