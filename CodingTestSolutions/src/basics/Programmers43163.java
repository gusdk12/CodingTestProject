package basics;

public class Programmers43163 {
    static boolean[] visited; // 방문 여부
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++){
            if(visited[i]){ // 방문한 단어면 뛰어넘기
                continue;
            }

            int spell = 0; // 같은 스펠링 몇 개인지 세기
            for(int j = 0; j < begin.length(); j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    spell++;
                }
            }

            // 한글자 빼고 모두 같은 경우
            if(spell == begin.length() - 1){
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
