package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15651 {
    static StringBuilder sb = new StringBuilder();
    static int[] seq;
    // static boolean[] visited;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        seq = new int[m];
        // visited = new boolean[n];

        backtracking(0);

        System.out.print(sb);
    }

    static void backtracking(int depth) {
        if(depth == m) {
            for(int val:seq) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<n; i++) {
            seq[depth] = i+1;
            backtracking(depth+1);
        }
    }
}
