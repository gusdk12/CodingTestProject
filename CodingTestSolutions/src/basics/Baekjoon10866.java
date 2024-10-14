package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Baekjoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 명령의 수
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>(); // 덱 선언

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 명령문

            switch (command) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken())); // 덱 앞에 삽입
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken())); // 덱 뒤에 삽입
                    break;
                case "pop_front":
                    if (deque.isEmpty()) { // 정수가 없는 경우
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.pollFirst()).append("\n"); // 맨 앞 정수 제거 후, 출력
                    } break;
                case "pop_back":
                   if (deque.isEmpty()) {
                       sb.append(-1).append("\n");
                   } else {
                       sb.append(deque.pollLast()).append("\n"); // 맨 뒤 정수 제거 후, 출력
                   } break;
                case "size":
                    sb.append(deque.size()).append("\n"); // 덱에 들어있는 정수 개수 출력
                    break;
                case "empty" :
                    if (deque.isEmpty()) { // 덱이 비어있는 경우
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    } break;
                case "front" :
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n"); // 가장 앞에 있는 수 출력
                    } break;
                case "back" :
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n"); // 가장 뒤에 있는 수 출력
                    } break;
            }
        }
        System.out.println(sb);
        br.close();
    }
}
