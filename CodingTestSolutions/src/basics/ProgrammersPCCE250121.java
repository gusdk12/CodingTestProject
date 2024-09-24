package basics;

import java.util.*;

public class ProgrammersPCCE250121 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> colData = new HashMap<>();
        // 데이터별 인덱스 부여
        colData.put("code", 0);
        colData.put("date", 1);
        colData.put("maximum", 2);
        colData.put("remain",3);

        // 스트림 형태로 변환 후, filter 함수로 val_ext보다 작은 데이터만 뽑아 2차원 배열로 변환
        int[][] answer = Arrays.stream(data)
                .filter(x -> x[colData.get(ext)] < val_ext).toArray(int[][]::new);
        // sort_by 값 기준으로 오름차순 정렬
        Arrays.sort(answer, (o1, o2) -> o1[colData.get(sort_by)] - o2[colData.get(sort_by)]);

        return answer;
    }
}
