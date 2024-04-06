package bj;

// ref -> https://velog.io/@kimmjieun/백준-15649번-N과-M1-Java-자바

// 백트래킹은 dfs로 풀 수 있다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {

    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] seq;
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        seq = new int[m];
        visited = new boolean[n]; // 각 노드 방문 상태

        backtracking(0);

        System.out.print(sb);
    }

    private static void backtracking(int depth) {
        if(depth == m) { // 이 떄 출력
            for(int val : seq) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<n; i++){
            // 해당 노드를 방문하지 않았다면
            if(!visited[i]) {
                visited[i] = true; // 방문상태 변경
                seq[depth] = i+1; // 해당 깊이를 인덱스로 하여 i+1 값 저장
                backtracking(depth+1); // 다음 자식노드 방문 위해 depth를 1 증가시키며 재귀 호출
                visited[i] = false; // 자식 노드 방문이 끝나고 돌아오면 방문하지 않은 상태로 변경
            }
        }
    }
}
