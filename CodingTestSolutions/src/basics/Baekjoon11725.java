package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon11725 {
    static int n; // 노드 개수 입력
    static int[] parent; // 부모 노드
    static boolean[] visited; // 방문 여부 확인
    static ArrayList<Integer>[] tree; // 트리 구조

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        parent = new int[n + 1];
        visited = new boolean[n + 1];
        tree = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n - 1; i++) {
            // 트리 상에서 연결된 두 정점
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            // 서로 연결하기
            tree[n1].add(n2);
            tree[n2].add(n1);
        }

        dfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int number) {
        visited[number] = true;
        for (int v : tree[number]){
            // 방문이 되지 않은 노드를 발견하면 자식노드로 처리
            if (!visited[v]){
                parent[v] = number; // 부모 노드에 담기
                dfs(v);
            }
        }

    }
}
