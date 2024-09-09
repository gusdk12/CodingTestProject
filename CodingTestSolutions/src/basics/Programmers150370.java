package basics;

import java.util.*;

public class Programmers150370 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();   // 파기해야하는 목록 리스트
        HashMap<String, Integer> termMap = new HashMap<>();
        int date = getDate(today);  // 오늘 날짜 '일' 형식으로 구하기

        // 약관종류와 유효기간 Map으로 저장
        for(String t : terms){
            String[] term = t.split(" ");
            termMap.put(term[0], Integer.parseInt(term[1]));
        }

        // 오늘 날짜와 수집일자 비교 후, 파기 목록 추가하기
        for(int i = 0; i < privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            if(getDate(privacy[0]) + (termMap.get(privacy[1]) * 28) <= date){
                result.add(i + 1);
            }
        }

        // 파기 목록 리스트 배열로 변환하기
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }

    // 오늘 날짜를 연.월.일에서 일로 바꾸기
    private int getDate(String today){
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
