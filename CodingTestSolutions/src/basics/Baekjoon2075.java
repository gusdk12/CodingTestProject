package basics;


import java.util.*;

public class Baekjoon2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> num = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                num.offer(sc.nextInt());
            }
        }
        System.out.println(num);

        for (int i = 0; i < num.size(); i++){
            num.poll();
        }
        num.peek();
    }
}
