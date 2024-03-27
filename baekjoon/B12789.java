package bj;

// ref -> https://blackvill.tistory.com/100

import java.io.*;
import java.util.*;

public class B12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // n명이 서 있음.

        Queue<Integer> q = new LinkedList<>(); // 현재 줄 서 있는 곳
        Stack<Integer> s = new Stack<>(); // 한 명씩만 설 수 있는 공간

        // 일단 모두 줄 세움
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int cnt = 1;
        while(!q.isEmpty()) {
            if(q.peek() == cnt) {
                q.poll();
                cnt++;
            } else if(!s.empty() && s.peek() == cnt) { // 이부분을 생각못해서 참고함
                s.pop();
                cnt++;
            } else {
                s.push(q.poll());
            }
        }

        while(!s.isEmpty()) {
            if(s.peek() ==  cnt) {
                s.pop();
                cnt ++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
