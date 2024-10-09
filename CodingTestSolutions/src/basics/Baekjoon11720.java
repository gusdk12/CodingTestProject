package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 숫자 N
        String number = br.readLine(); // 입력된 숫자들
        int sum = 0; // 총합

        for (int i = 0; i < n; i++) {
            int num = number.charAt(i) - '0'; // 정수 변환
            sum += num;
        }
        System.out.println(sum);
        br.close();
    }
}
