package basics;

public class Programmers12909 {
    boolean solution(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else if (s.charAt(i) == ')') {
                cnt--;
            }

            // cnt가 음수가 되는 순간, 올바르지 않은 괄호 문자열
            if (cnt < 0) {
                return false;
            }
        }

        // 모든 문자를 처리한 후 cnt가 0이면 올바른 괄호 문자열
        return cnt == 0;
    }
}
