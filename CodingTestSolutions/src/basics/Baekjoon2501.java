package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int i;
        List<Integer> arr = new ArrayList<>();

        // N의 약수 찾기
        for (i = 1; i <= N; i++){
            if (N % i == 0) {
                arr.add(i); // N의 약수 List 에 담기
//                System.out.println(i);
            }
        }

        // N의 약수 갯수가 K보다 적을 때
        if (arr.size() < K) {
            System.out.println(0);
        } else {
            // K번째 약수 출력
            System.out.println(arr.get(K - 1));
        }

        sc.close();
    }
}