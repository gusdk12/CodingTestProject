package basics;

import java.util.*;

public class Programmers1844 {
    // 상하좌우 좌표
    int[] dx = {0, 1 , 0, -1};
    int[] dy = {-1, 0, 1, 0};

    public int solution(int[][] maps) {
        int answer = 0;

        // 방문 기록
        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = visited[maps.length - 1][maps[0].length - 1]; // 상대방 진영 좌표

        // 상대방 진영에 도착할 수 없을 경우
        if(answer == 0){
            answer = -1;
        }
        return answer;
    }

    public void bfs(int[][] maps, int[][] visited){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0}); // 시작점 추가
        visited[0][0] = 1;

        while(!q.isEmpty()) {
            // 현재위치
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            // 상하좌우 탐색
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                // maps 범위를 넘어간다면 다음으로 건너뛰기
                if(nx < 0 || nx > maps.length - 1 || ny < 0 || ny > maps[0].length - 1) {
                    continue;
                } else if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    // 아직 방문하지 않고, 벽이 없는 경우
                    visited[nx][ny] = visited[x][y] + 1; // 방문 체크하기
                    q.add(new int[]{nx, ny}); // q에 지나갈 수 있는 좌표 추가
                }
            }
        }
    }
}
