package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            q.offer(i);
        }

        int i=1;

        sb.append("<");
        while(!q.isEmpty()) {
            if(i%k == 0) {
                sb.append(q.poll());
                if(q.size() != 0) sb.append(", ");
            } else {
                q.offer(q.poll());
            }
            i++;
        }
        sb.append(">");

        System.out.println(sb);
    }
}
