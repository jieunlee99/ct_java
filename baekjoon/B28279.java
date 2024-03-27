package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        int cmd, x;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cmd = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case 1:
                    x = Integer.parseInt(st.nextToken());
                    deque.offerFirst(x);
                    break;
                case 2:
                    x = Integer.parseInt(st.nextToken());
                    deque.offerLast(x);
                    break;
                case 3:
                    if(!deque.isEmpty()) {
                        sb.append(deque.peekFirst()).append("\n");
                        deque.pollFirst();
                    } else
                        sb.append(-1).append("\n");
                    break;
                case 4:
                    if(!deque.isEmpty()) {
                        sb.append(deque.peekLast()).append("\n");
                        deque.pollLast();
                    } else
                        sb.append(-1).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 7:
                    if(!deque.isEmpty()) sb.append(deque.peekFirst()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case 8:
                    if(!deque.isEmpty()) sb.append(deque.peekLast()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
