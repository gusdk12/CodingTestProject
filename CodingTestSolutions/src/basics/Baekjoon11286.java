package basics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Baekjoon11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 우선순위 큐 선언(N만큼 입력되는 숫자 집합)
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // 절대값 비교(집합에 추가하기 전 비교)
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1- o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                int out = pq.isEmpty() ? 0 : pq.poll();
                // 비어있는 경우는 0이 되고, 아닌 경우 가장 작은 수 출력
                System.out.println(out);
            } else {
                pq.offer(x);
            }
        }
    }
}
