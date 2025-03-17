package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 좋은 단어 개수
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String words = br.readLine(); // 입력 단어
            Stack<Character> word = new Stack<>();

            for(int j = 0; j < words.length(); j++){
                // word가 비어있거나 word에 담긴 글자와 해당 인덱스의 글자가 다른 경우
                if(word.isEmpty() || words.charAt(j) != word.peek()) {
                    word.push(words.charAt(j));
                // word에 담긴 글자와 해당 인덱스의 글자가 같은 경우
                } else if (words.charAt(j) == word.peek()) {
                    word.pop();
                }
            }
            // 최종 word가 비어있으면 cnt 증가
            if(word.isEmpty()) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
