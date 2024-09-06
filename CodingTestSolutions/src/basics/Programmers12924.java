package basics;

public class Programmers12924 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0; // 연속된 자연수들의 합
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {  // 합이 n이 될 경우
                    answer++;
                    break;
                } else if (sum > n) {   // 합이 n보다 커질 경우
                    break;
                }
            }
        }

        return answer;
    }
}
