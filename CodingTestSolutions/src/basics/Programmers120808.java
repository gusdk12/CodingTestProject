package basics;

public class Programmers120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 분수를 더했을 때 분자, 분모 값
        int numer = numer1 * denom2 + numer2 * denom1; // 분자
        int denom = denom1 * denom2; // 분모

        int max = 1; // 초기 최대공약수
        for(int i = 1; (i <= numer && i <= denom); i++){
            if (numer % i == 0 && denom % i == 0){
                max = i; // 최대공약수 구하기
            }
        }
        numer = numer/max;
        denom = denom/max;

        int[] answer = {numer, denom};
        return answer;
    }
}
