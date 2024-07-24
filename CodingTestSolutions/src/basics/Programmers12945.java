package basics;

public class Programmers12945 {
    public int solution(int n) {
        return fibo(0, 1, 2, n);    // 재귀함수 시작 지정
    }

    public int fibo(int prev, int curr, int index, int N){
        if(index == N) return (prev + curr) % 1234567;  // 재귀함수 종료 시점
        return fibo(curr, (prev + curr) % 1234567, index + 1 , N);
    }
}
