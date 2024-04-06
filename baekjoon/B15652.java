package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15652 {
    static StringBuilder sb = new StringBuilder();
    static int[] seq;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        seq = new int[m];

        backtracking(0, 0);

        System.out.print(sb);
    }

    static void backtracking(int depth, int start) {
        if(depth == m) {
            for(int val:seq) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<n; i++) {
            seq[depth] = i+1;
            backtracking(depth+1, i);
        }
    }
}
