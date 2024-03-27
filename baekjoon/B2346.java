package bj;

// ref -> https://minoflower.tistory.com/51
// 클래스로 idx, element 값 같이 관리 가능..

import java.io.*;
import java.util.*;

public class B2346 {
    static class Balloon {
        int idx;
        int element;

        public Balloon(int idx, int element) {
            this.idx = idx;
            this.element = element;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // idx, element 같이 저장
        Deque<Balloon> deque = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            deque.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        int prev = 0;

        while(deque.size() > 1) {
            Balloon cur = prev >= 0  ? deque.pollFirst() : deque.pollLast();
            for(int i=1; i<Math.abs(cur.element); i++) {
                if(cur.element > 0) {
                    deque.offerLast(deque.pollFirst());
                } else {
                    deque.offerFirst(deque.pollLast());
                }
            }
            prev = cur.element;
            sb.append(cur.idx).append(" ");
        }
        // 마지막으로 남은 하나 출력
        sb.append(deque.poll().idx);

        System.out.println(sb);
    }
}
