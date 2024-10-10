package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon1927 {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 입력한 숫자 담을 배열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); // 입력할 숫자 개수

        StringBuilder sb = new StringBuilder(); // 입력값이 0일 경우 제거되는 첫번째 값 답기
        for (int i = 0; i < x; i++) {
            int num = Integer.parseInt(br.readLine()); // 입력되는 숫자

            if (num == 0) { // 입력값이 0일 경우
                if (pq.isEmpty()) { // 배열이 비어있을 경우
                    sb.append(0 + "\n");
                } else {
                    sb.append(pq.poll() + "\n");
                }
            } else { // 입력값이 0이 아닐 경우
                pq.add(num);
            }
        }
        System.out.println(sb);
        br.close();
    }
}
