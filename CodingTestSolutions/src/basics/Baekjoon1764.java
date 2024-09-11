package basics;

import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 듣도 못한 사람의 수
        int M = sc.nextInt(); // 보도 못한 사람의 수
        sc.nextLine(); // 줄바꿈 용도

        Set<String> names = new HashSet<>(); // 입력한 사람이름 모음

        for (int i = 0; i < N; i++) {
            names.add(sc.nextLine());
        }

        List<String> result = new ArrayList<>(); // 듣도 보도 못한 사람 이름 모음
        for (int i = 0; i < M; i++){
            String Names = sc.nextLine();
            // N에서 입력한 이름과 M에서 입력한 이름 중 중복 여부 확인
            if(names.contains(Names)){
                result.add(Names);
            }
        }

        Collections.sort(result); // 사전순으로 정렬
        System.out.println(result.size());
        for (String name : result){
            System.out.println(name);
        }
    }
}
