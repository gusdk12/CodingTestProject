package basics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> cards = new LinkedList<>();

        // 카드 N장 만들기
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            cards.offer(i);
        }

        while (cards.size() > 1){
            // 맨 윗장 카드 버리기
            cards.poll();
            // 그 다음 맨 윗장 카드 맨뒤로 추가하기
            cards.offer(cards.poll());
        }
        // 마지막 남은 카드 출력
        System.out.println(cards.poll());

        sc.close();
    }
}

