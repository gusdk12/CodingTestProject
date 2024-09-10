package basics;

import java.util.Scanner;

public class Programmers12947 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int X = x;

        while(X > 0) {
            sum += X % 10;
            X = X / 10;
        }

        if (x % sum == 0) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}
