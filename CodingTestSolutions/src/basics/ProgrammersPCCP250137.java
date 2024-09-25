package basics;

import java.util.*;

public class ProgrammersPCCP250137 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer, Integer> attackInfo = new HashMap<>();
        int curHealth = health; // 현재 체력
        int successTime = 0; // 연속 성공 시간

        // key, value로 저장
        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
        }

        for (int i = 0; i <= attacks[attacks.length - 1][0]; i++) {
            // 공격이 있는 경우
            if (attackInfo.containsKey(i)) {
                curHealth -= attackInfo.get(i);
                successTime = 0;
            } else {
                // 공격이 없는 경우
                curHealth += bandage[1];
                successTime++;
                if (successTime == bandage[0]) { // 성공 시간이 시전 시간과 동일해지면
                    curHealth += bandage[2]; // 추가 회복
                    successTime = 0;
                }
                if (curHealth > health) {
                    curHealth = health; // 현재 체력이 최대 체력보다 커지면 최대 체력으로 설정
                }
            }
            // 현재 체력이 0 이하가 되는 경우
            if (curHealth <= 0) {
                return -1;
            }
        }
        return curHealth;
    }
}

