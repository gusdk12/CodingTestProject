package basics;

public class Programmers12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 새로운 행렬 = arr1의 행 * arr2의 열 크기
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                // arr1의 열 개수(= arr2의 행 개수)만큼 반복
                for(int k = 0; k < arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
