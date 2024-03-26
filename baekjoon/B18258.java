package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        int back  = 0;

        String cmd;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    q.offer(x);
                    back = x;
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(q.poll()+"\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()+"\n");
                    break;
                case "empty":
                    if(q.isEmpty()) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case "front":
                    if(q.isEmpty()) sb.append(-1+"\n");
                    else sb.append(q.peek()+"\n");
                    break;
                case "back":
                    if(q.isEmpty()) sb.append(-1+"\n");
                    else sb.append(back+"\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
