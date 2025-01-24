package basics;

import java.util.HashMap;
import java.util.Map;

public class Programmers131127 {
    public static void main(String[] args){
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want, number, discount));
    }

    public static int solution(String[] want, int[] number, String[] discount){
        int answer = 0;

        // 원하는 구매목록 Map으로 만들기
        Map<String, Integer> list = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            list.put(want[i], number[i]);
        }

        // 10일씩 묶어서 할인목록과 구매목록 확인하기
        for(int i = 0; i < discount.length - 9; i++){
            // 비교용 목록 Map으로 만들기
            Map<String, Integer> purchase = new HashMap<>(list);

            // 날짜별 할인목록과 구매목록 확인하기
            for(int j = i; j < i + 10; j++){
                // 만약 할인목록과 구매목록이 일치하지 않거나 수량이 0이 되면 다음 순서 목록과 비교하기
                if(purchase.getOrDefault(discount[j], -1) <= 0){
                    break;
                }
                // 할인목록과 구매목록 일치하면 수량 수정하기
                purchase.put(discount[j], purchase.get(discount[j]) - 1);

                // 기간이 10일이 되면 회원등록 가능 날짜 횟수 증가
                if(j == i + 9) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
