package basics;

import java.util.HashMap;
import java.util.Map;

public class Programmers178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> player = new HashMap<>();

        for (int i = 0; i < players.length; i++){
            // key : 선수 이름, value : 순위
            player.put(players[i], i);
        }

        for(String calling : callings) {
            // 이름 불린 선수 기존 순위
            int rank = player.get(calling);

            // 순위 변동
            player.put(players[rank - 1], rank);
            player.put(players[rank], rank - 1);

            // 순위 변동 선수명
            String name = players[rank - 1];
            players[rank - 1] = players[rank];
            players[rank] = name;
        }
        return players;
    }
}
