package basics;

import java.util.Arrays;

class Programmers42746 {
    public String solution(int[] numbers) {

        String[] num = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            num[i] = Integer.toString(numbers[i]);
        }

        // 내림차순 정렬
        Arrays.sort(num, (a, b) -> (b + a).compareTo(a + b));

        // 정렬된 배열에서 첫 숫자가 0인지 확인(첫 숫자가 0이면 모든 숫자가 0)
        if(num[0].equals("0")){
            return "0";
        }

        // 정렬된 숫자 붙이기
        return String.join("", num);
    }
}