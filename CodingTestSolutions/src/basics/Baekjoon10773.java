package basics;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> money = new Stack<>();

        int K = sc.nextInt();
        for (int i = 0; i < K; i++){
            int M = sc.nextInt();
            System.out.println(money);
            if (M == 0) {
                // 잘못 불렀을 경우
                money.pop();    // 맨 위의 값 삭제
            } else {
                money.add(M);   // 0이 아닐 경우 값 추가
            }
        }

        // 총합 구하기
        int sum = 0;
        for (int pay : money){
            sum += pay;
        }
        System.out.println(sum);

        sc.close();
    }
}
