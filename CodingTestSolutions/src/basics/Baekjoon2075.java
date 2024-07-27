package basics;


import java.util.*;

public class Baekjoon2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> num = new PriorityQueue<>(Collections.reverseOrder());

        // N * N 만큼 숫자 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                num.offer(sc.nextInt());
            }
        }

        // 맨 앞부터 N 전까지 큰 숫자 버리기
        for (int i = 0; i < N - 1; i++){
            num.poll();
        }
        System.out.println(num.peek()); // N번째 숫자 출력

        sc.close();
    }
}
