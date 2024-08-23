package basics;

public class Programmers12916 {
        boolean solution(String s) {

            String word = s.toLowerCase(); // 모두 소문자 치환
            int p = 0; // p 개수
            int y = 0; // y 개수

            for (int i = 0; i < word.length(); i++) {
                if ('p' == word.charAt(i)) p++;
                else if ('y'  == word.charAt(i)) y++;
            }

            boolean answer = true;
            if (p != y) {
                answer = false;
            }

            return answer;
        }
}
