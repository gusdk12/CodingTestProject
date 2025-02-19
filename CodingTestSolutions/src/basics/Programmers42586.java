package basics;

import java.util.*;

public class Programmers42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        // 기능 작업 기간 queue에 추가
        for(int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int first = queue.poll();   // 첫 번째 작업 기간
        int cnt = 1;    // 배포 개수

        while(!queue.isEmpty()) {
            // 첫번째 작업 기간이 다음 작업 기간보다 늦게 끝나거나 같이 끝나는 경우
            if(first >= queue.peek()) {
                cnt++;
                queue.poll();
            } else {
                list.add(cnt);
                cnt = 1; // 개수 초기화
                first = queue.poll(); // 다음 작업 기간으로 재설정
            }
        }
        list.add(cnt); // 마지막 배포 추가

        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
