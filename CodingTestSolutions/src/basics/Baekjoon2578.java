package basics;

import java.util.Scanner;

public class Baekjoon2578 {
    static int[][] bingo; // 빙고 숫자 담을 배열
    static int cnt; // 빙고 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bingo = new int[5][5];
        cnt = 0;

        // 빙고판 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        for (int k = 1; k <= 25; k++) {
            int num = sc.nextInt(); // 사회자가 부른 숫자

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    // 사회자가 부른 숫자와 같으면 = 0으로 변경
                    if (bingo[i][j] == num) bingo[i][j] = 0;
                }
            }

            // 빙고있는지 체크
            rCheck();
            cCheck();
            lrCheck();
            rlCheck();

            if (cnt >= 3) { // 3줄 이상 빙고면 몇 번째 숫자인지 출력
                System.out.println(k);
                break;
            }

            cnt = 0;
        }
    }

    // 가로 체크
    public static void rCheck() {
        for (int i = 0; i < 5; i++) {
            int zero = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == 0) zero++;
            }

            if (zero == 5) cnt++;
        }
    }

    // 세로 체크
    public static void cCheck() {
        for (int i = 0; i < 5; i++) {
            int zero = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == 0) zero++;
            }
            if (zero == 5) cnt++;
        }
    }

    // 왼쪽에서 오른쪽 대각선 체크
    public static void lrCheck() {
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == 0) zero++;
        }
        if (zero == 5) cnt++;
    }

    // 오른쪽에서 왼쪽 대각선 체크
    public static void rlCheck() {
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == 0) zero++;
        }
        if (zero == 5) cnt++;
    }
}
