package basics;

import java.util.*;

public class Programmers160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        // keymap 위 모든 알파벳의 최소 클릭 수 구하기
        for (int i = 0; i < keymap.length; i++) {
            // 최소 클릭 수로 덮어씌우기 위해 문자열 끝부터 시작
            for (int j = 0; j < keymap[i].length(); j++) {
                // 현재 문자가 map에 있는지 확인
                if (map.containsKey(keymap[i].charAt(j))) {
                    // 최소 클릭 수가 뒤에 나왔을 때 갱신
                    if (map.get(keymap[i].charAt(j)) > (j + 1)) {
                        map.put(keymap[i].charAt(j), j + 1);
                    }
                } else {
                    map.put(keymap[i].charAt(j), j + 1);
                }
            }
        }

        // 모든 targets 단어에 대해 반복
        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char word = targets[i].charAt(j);
                Integer minClick = map.get(word);
                if (minClick != null) {
                    cnt += minClick;
                } else {
                    cnt = -1;
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
