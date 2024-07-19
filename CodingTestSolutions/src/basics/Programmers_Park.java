package basics;
public class Programmers_Park {
    public int[] solution(String[] park, String[] routes) {
        int robotX = 0, robotY = 0; // 로봇의 출발지점
        int parkW = park[0].length();   // 가로길이
        int parkH = park.length;    // 세로길이

        for (int i = 0; i < parkH; i++) {
            for (int j = 0; j < parkW; j++) {
                if (park[i].charAt(j) == 'S') {
                    robotX = j;
                    robotY = i;
                }
            }
        }

        for(String route : routes) {
            String[] r = route.split(" ");
            String direction = r[0];    // 방향
            int step = Integer.parseInt(r[1]);  // 이동할 칸 수

            int moveX = 0, moveY = 0;   // 이동 좌표
            switch(direction){
                case "N": moveY = -1; break; // 북쪽으로 1칸
                case "S": moveY = 1;  break;  // 남쪽으로 1칸
                case "W": moveX = -1; break; // 서쪽으로 1칸
                case "E": moveX = 1; break;  // 동쪽으로 1칸
            }

            boolean go = true; // 이동가능 여부
            int W = robotX, H = robotY;
            for(int i = 1; i <= step; i++){
                W += moveX;
                H += moveY;
                if(W < 0 || W >= parkW || H < 0 || H >= parkH
                        || park[H].charAt(W) == 'X'){
                    go = false;
                    break;
                }
            }

            if(go) {
                robotX = W;
                robotY = H;
            }
        }
        int[] answer = new int[2];
        answer[0] = robotY;
        answer[1] = robotX;
        return answer;
    }
}
