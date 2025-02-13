package basics;

public class Programmers12951 {
    public String solution(String s) {
        String answer = "";
        String[] w = s.split(" "); // 공백 기준으로 자르기

        for(int i = 0; i < w.length; i++) {
            String word = w[i];

            // 문자열이 공백으로만 이루어졌을 경우
            if(word.length() == 0) {
                answer += " ";
            } else {
                answer += word.substring(0, 1).toUpperCase(); // 첫 문자 대문자
                answer += word.substring(1, word.length()).toLowerCase(); // 그 이후 소문자
                answer += " "; // 공백으로 연결
            }
        }
        // s 문자열의 맨뒤가 공백일 경우 answer 그대로 리턴
        if(s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer;
        }
        // s 문자열이 맨뒤가 공백 아닐 경우 answer 맨 마지막에 더해진 공백 제거 후 리턴
        return answer.substring(0, answer.length() - 1);
    }
}
