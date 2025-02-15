package basics;

public class Programmers43165 {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    // depth: 노드 깊이, sum: 이전 노드까지의 결과값
    public void dfs(int[] numbers, int depth, int target, int sum){
        // 마지막 노드까지 탐색한 경우
        if(numbers.length == depth) {
            if(target == sum){
                answer++;
            }
        } else { // 탐색할 노드가 남아있는 경우
            // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            // 해당 노드의 값을 빼고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}
