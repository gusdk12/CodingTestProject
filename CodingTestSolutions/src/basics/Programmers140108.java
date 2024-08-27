package basics;

public class Programmers140108 {
    public int solution(String s) {

        int x = 0; // 첫 글자 개수
        int o = 0; // 다른 글자 개수
        int answer = 0; // 분해한 문자열 개수
        char word = s.charAt(0); // 첫 문자열

        for (int i = 0; i < s.length(); i++) {
            if (word == s.charAt(i)) { // 첫 글자와 같을 경우
                x++;
            } else {
                o++;
            }

            if (x == o) {
                answer++;

                // 다음 부분 문자열을 위해 초기화
                if (i + 1 < s.length()) {
                    word = s.charAt(i + 1);
                }
                x = 0;
                o = 0;
            }
        }
        // 루프가 끝난 후 남은 부분 문자열도 고려
        if (x != 0 || o != 0) {
            answer++;
        }

        return answer;
    }
}
