package basics;

public class Programmers147355 {
    public int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int cnt = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            long result = Long.parseLong(t.substring(i, len + i));
            // 범위가 int의 값을 초과할 수 있기 때문에 long 설정
            if (result <= num) {
                cnt++;
            }
        }

        int answer = cnt;
        return answer;
    }
}
