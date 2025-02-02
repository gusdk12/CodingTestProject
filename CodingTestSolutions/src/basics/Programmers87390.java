package basics;

public class Programmers87390 {
    public int[] solution(int n, long left, long right) {

        int[] answer = new int[(int)(right - left) + 1];

        int index = 0; // 인덱스
        for (long i = left; i <= right; i++){
            long row = i / n + 1; // 행
            long col = i % n + 1; // 열

            answer[index] = (int) Math.max(row, col);
            index++;
        }
        return answer;
    }
}
