package basics;

import java.util.*;

public class Baekjoon25757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 신청 횟수
        String game = sc.nextLine().trim();    // 게임 종류
        Set<String> players = new HashSet<>();   // 플레이어들 이름

        // 플레이어 이름 N번 입력 및 중복 이름 제거
        for (int i = 0; i < N; i++) {
            String player = sc.nextLine();
            players.add(player);
        }

        // 게임 종류에 따른 인원수
        int num = 0;
        switch (game){
            case "Y" : num = 2; break;
            case "F" : num = 3; break;
            case "O" : num = 4; break;
        }

        // 최대 횟수 구하기
        if (players.size() >= num - 1) {
            int max = players.size() / (num - 1);
            System.out.println(max);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
