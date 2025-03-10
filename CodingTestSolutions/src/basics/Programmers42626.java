package basics;

import java.util.*;

public class Programmers42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 우선순위 큐 선언하여 오름차순 정렬
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 우선순위 큐에 스코빌 지수 넣기
        for(int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        while (queue.peek() < K) {
            // k 이상으로 만들 수 없는 경우
            if(queue.size() == 1) {
                return -1;
            }
            // 섞은 음식의 스코빌 지수
            queue.add(queue.poll() + (queue.poll() * 2));
            answer++;
        }
        return answer;
    }
}
