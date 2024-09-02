package basics;

public class Baekjoon4673 {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001]; // 1 ~ 10000

        for (int i = 1; i < 10001; i++){

            int n = d(i); // 생성자가 있는 숫자
            if (n < 10001) {
                check[n] = true;
            }

            if (!check[i]) System.out.println(i); // 생성자 없는 숫자
        }
    }

    // d(n) 함수
    public static int d(int num){
        int sum = num;

        while (num != 0){
            sum = sum + (num % 10); // 첫째 자리 수
            num = num / 10; // 첫째 자리 수 없애기
        }
        return sum;
    }
}
