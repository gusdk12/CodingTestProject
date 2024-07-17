package basics;

import java.util.Scanner;

public class Baekjoon16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;    // 연산값

        while (B != A) {
            if (B % 2 == 0) {   // 2로 나눌 수 있을 때
                B /= 2;
            } else if (B % 10 == 1) {   // 나머지가 1일 때, 자리수 줄이기
                B /= 10;
            } else {    // 연산이 되지 않을 경우 -1 출력
                System.out.println(-1);
                return;
            }

            // 만약 B가 A보다 작으면 연산이 될 수 없음
            if (B < A) {
                System.out.println(-1);
                return;
            }
            cnt++;  // 연산이 될 때마다 cnt 1씩 증가
        }

        // 연산의 최솟값에 1을 더한 값
        System.out.println(cnt + 1);

        sc.close();
    }
}
