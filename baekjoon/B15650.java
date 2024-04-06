package bj;

// ref -> https://velog.io/@kimmjieun/백준-15650번-N과-M-2-Java-자바

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15650 {
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

        backtracking(0, 0);

        System.out.print(sb);
    }

    static void backtracking(int depth, int start) {
        if(depth == m) {
            for(int val : seq) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                seq[depth] = i+1;
                backtracking(depth+1, i+1);
                visited[i] = false;
            }
        }
    }
}
