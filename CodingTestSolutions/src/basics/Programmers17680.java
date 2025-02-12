package basics;

import java.util.*;

public class Programmers17680 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        // 캐시크기가 0일 경우
        if(cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> caches = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase(); // 대소문자 구분 없음

            if(caches.contains(city)) { // 캐시 안에 이미 있는 경우
                caches.remove(city); // 기존 이름 삭제 후
                caches.add(city); // 새로 맨 뒤에 추가
                answer += 1;
            } else { // 캐시에 없는 경우
                if(caches.size() >= cacheSize) { // 캐시가 꽉 찼을 때
                    caches.remove(0); // 오랫동안 사용하지 않은 캐시 제거
                    caches.add(city); // 맨 뒤에 새로 추가
                } else { // 캐시가 비어있을 경우
                    caches.add(city); // 맨 뒤에 추가
                }
                answer += 5;
            }
        }
        return answer;
    }
}
