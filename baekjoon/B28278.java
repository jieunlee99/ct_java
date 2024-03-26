package bj;

import java.io.*;
import java.util.*;

public class B28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int cmd;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cmd = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if(stack.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()+"\n");
                    break;
                case 4:
                    if(stack.isEmpty()) sb.append(1+"\n");
                    else sb.append(0+"\n");
                    break;
                case 5:
                    if(stack.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(stack.peek()+"\n");
                    }
                    break;
            }
        }
        System.out.print(sb);
    }
}
