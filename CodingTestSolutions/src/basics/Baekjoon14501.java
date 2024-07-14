package basics;

import java.util.Scanner;

public class Baekjoon14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 상담 가능 일자
        int[] day = new int[N]; // 상담 소요 기간
        int[] pay = new int[N]; // 상담 금액

        for (int i = 0; i < N; i++) {
            day[i] = sc.nextInt();
            pay[i] = sc.nextInt();
        }

        int[] DP = new int[N + 1];  // N일에 얻을 수 있는 최대 수익
        for (int i = 0; i < N; i++){
            if (i + day[i] < N + 1) {
                // 날짜가 범위를 넘어가지 않는 경우
                DP[i + day[i]] = Math.max(DP[i + day[i]], DP[i] + pay[i]);
            }
            // 해당날짜에 일할 수 없다면 이전까지 일한 최대수당 넣어주기
            DP[i + 1] = Math.max(DP[i + 1], DP[i]);
        }
        System.out.println(DP[N]);

    }
}
