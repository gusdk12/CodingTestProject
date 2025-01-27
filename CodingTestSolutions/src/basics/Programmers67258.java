package basics;

import java.util.*;

public class Programmers67258 {
    public int[] solution(String[] gems) {

        Map<String, Integer> map = new HashMap<>(); // 구간별 보석 종류, 수
        Set<String> set1 = new HashSet<>(); // 총 보석 종류
        Set<String> set2 = new HashSet<>(); // 구간별 보석 종류

        // 전시된 보석 종류 담기
        for(String s : gems) {
            set1.add(s);
        }

        int right = 0, left = 0; // 마지막, 시작 구간 번호
        int len = Integer.MAX_VALUE; // 구간 최대값
        int[] answer = new int[2];

        while (right < gems.length) {
            map.put(gems[right], map.getOrDefault(gems[right], 0) + 1); // 보석 추가
            set2.add(gems[right]);

            // 보석이 2개 이상인 경우 제거하고 다음 구간 넘어가서 탐색하기
            while (map.get(gems[left]) > 1) {
                // 구간에 있는 보석만 V 값 수정하기
                map.replace(gems[left], map.get(gems[left]) - 1);
                left++;
            }

            // 모든 보석을 모으고 최단 구간 구하기
            if (set1.size() == set2.size() && right - left < len) {
                answer[0] = left + 1;
                answer[1] = right + 1;
                len = right - left;
            }
            right++; // 오른쪽으로 구간 확장하기
        }
        return answer;
    }
}
