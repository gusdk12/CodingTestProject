package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers120880 {

    public List<Integer> solution(int[] numlist, int n) {

        List<Integer> numberList = new ArrayList<>();
        // numlist 숫자를 numberList (List 자료구조)에 추가
        for (int i = 0; i < numlist.length; i++) {
            numberList.add(numlist[i]);
        }

        // numberList 의 숫자들 n을 기준으로 정렬
        Collections.sort(numberList, (a, b) -> {
            // 만약 거리가 같다면 큰 숫자부터 정렬
            if (Math.abs(n - a) - Math.abs(n - b) == 0) {
                return b - a;
            } else {    // 거리값이 가까운 숫자부터 정렬
                return Math.abs(n - a) - Math.abs(n - b);
            }
        });

        return numberList;
    }
}
