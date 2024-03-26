package bj;

// ref -> https://blackvill.tistory.com/100

import java.io.*;
import java.util.*;

public class B12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 학생 수

        Queue<Integer> q = new LinkedList<>(); // 대기열
        Stack<Integer> s= new Stack<>(); // 추가 대기열

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 줄 서있는 학생들을 큐에 넣는다.
        for(int i=0; i<n; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1; // 간식 먹는 순서

        // 큐에 있는 학생들을 간식을 받게 하거나 추가 대기시킴
        while(!q.isEmpty()) {
            if(q.peek() == start) {
                q.poll();
                start++;
            } else if(!s.isEmpty() && s.peek() == start) {
                s.pop();
                start++;
            } else {
                s.push(q.poll());
            }
        }

        // 추가 대기중인 학생들을 간식을 주거나 실패
        while(!s.isEmpty()) {
            if(s.peek() == start) {
                s.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
