package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N만큼 배열에 숫자 답기
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 오름차순 정렬
        Arrays.sort(arr);

        // M만큼 입력한 숫자들이 있는지 확인(이진 탐색)
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 이진탐색
            int result = Arrays.binarySearch(arr, num);
            if (result < 0 ) {  // 숫자가 존재하지 않아 음수가 나올 경우
                sb.append(0 + "\n");
            } else {    // 숫자가 존재할 경우
                sb.append(1 + "\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
