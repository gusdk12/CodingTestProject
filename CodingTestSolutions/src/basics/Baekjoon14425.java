package basics;

import java.util.*;

public class Baekjoon14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Set<String> S = new HashSet<>();
        for (int i = 0; i < N; i++){
            S.add(sc.nextLine());
        }

        List<String> wordList = new ArrayList<>();
        for (int i = 0; i< M; i++){
            String word = sc.nextLine();
            if (S.contains(word)){
                wordList.add(word);
            }
        }

        System.out.println(wordList.size());
    }
}
