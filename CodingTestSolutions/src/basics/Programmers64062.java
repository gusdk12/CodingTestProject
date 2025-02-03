package basics;

public class Programmers64062 {
    public int solution(int[] stones, int k) {
        int answer = 0;

        // 건널 수 있는 친구들 수를 기준으로 이중탐색
        int left = 1; // 건널 수 있는 친구 최소값
        int right = 200000000; // 건널 수 있는 친구 최대값

        while(left <= right) {
            int mid = (left + right) / 2; // 징검다리 건너는 인원

            // 모두 건널 수 있는지 확인하기
            if(check(stones, k, mid)) {
                left = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    // 친구들이 건널 수 있는지 확인
    public boolean check(int[] stones, int k, int mid) {
        int skip = 0;
        for(int stone : stones) {
            // 적힌 숫자가 친구들보다 적은 경우
            if(stone < mid) {
                // 건널 수 없기 때문에 건너뛰는 디딤돌 증가
                skip++;
                // 만약 연속으로 증가해 k와 같아지면 false 리턴
                if(skip == k){
                    return false;
                }
            } else { // 징검다리 모두 건널 수 있다면
                skip = 0;
            }
        }
        return true;
    }
}
