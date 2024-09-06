package basics;

import java.util.Scanner;

public class Beakjoon2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 마실 수 있는 횟수

        int[] wine = new int[n];
        for (int i = 0; i < n; i++) {
            wine[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = wine[0];

        for (int i = 1; i < n; i++) {
            if (i == 1) {
                dp[1] = wine[0] + wine[1]; // 첫번째 잔과 두번째 잔 모두 마신 경우
                continue;
            } else if (i == 2) {
                dp[2] = Math.max(dp[1], Math.max(wine[0] + wine[2], wine[1] + wine[2]));
                // 첫번째 잔과 세번째 잔 또는 두번째 잔과 세번째 잔 마신 경우 중 최대값 구하기
                continue;
            }
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
            // dp[i - 1]: 현재 잔을 마시지 않은 경우
            // dp[i - 2] + wine[i]: 두잔을 연속으로 마시지만 그 전의 잔은 건너뛴 경우
            // dp[i - 3] + wine[i - 1] + wine[i]: 바로 전 잔과 현재 잔을 연속으로 마시는 경우
        }
        System.out.println(dp[n-1]);
    }
}
