package basics;

import java.util.Scanner;

public class Baekjoon14888 {

    private static int Max = Integer.MIN_VALUE; // 초기 최대값
    private static int Min = Integer.MAX_VALUE; // 초기 최소값
    private static int[] number;    // 숫자를 담을 배열
    private static int N;   // 숫자 개수
    private static int[] operator = new int[4]; // 연산자 개수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        number = new int[N];

        // 숫자 입력
        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }

        // 연산자별 개수 입력
        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        dfs(number[0], 1);

        System.out.println(Max);
        System.out.println(Min);

        sc.close();
    }

    public static void dfs(int num, int index){
        if (index == N){
            Max = Math.max(Max, num);   // 최대값 찾기
            Min = Math.min(Min, num);   // 최소값 찾기
            return;
        }

        for (int i = 0; i < 4; i++){
            // 연산자 개수가 1개 이상인 경우
            if (operator[i] > 0) {
                operator[i]--;

                // 재귀함수 활용
                switch (i){
                    case 0: dfs(num+ number[index], index + 1);
                    break;
                    case 1: dfs(num - number[index], index + 1);
                    break;
                    case 2 : dfs(num * number[index], index + 1);
                    break;
                    case 3: dfs(num / number[index], index + 1);
                    break;
                }

                operator[i]++;
            }
        }

    }
}
