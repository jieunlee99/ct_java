package bj;

// ref -> https://minoflower.tistory.com/51
// 클래스로 idx, element 값 같이 관리 가능..

import java.io.*;
import java.util.*;

public class B2346 {
    static class Ballon {
        int idx;
        int value;

        public Ballon(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Ballon> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            deque.offer(new Ballon(i, Integer.parseInt(st.nextToken())));
        }

        int prev = 0;
        while(deque.size() > 1) {
            // 이전 풍선의 값이 양수인지 음수인지에 따라
            // 양수라면 맨 앞 원소를 추출하고, 음수라면 맨 뒤 원소를 추출한다.
            Ballon cur = (prev >= 0 ) ? deque.pollFirst() : deque.pollLast();
            for(int i=0; i<Math.abs(cur.value)-1; i++) {
                if(cur.value > 0) { // 풍선 안 종이가 양수일 때는 오른쪽으로 이동
                    deque.offerLast(deque.pollFirst());
                } else { // 음수일 때는 왼쪽으로 이동
                    deque.offerFirst(deque.pollLast());
                }
            }

            prev = cur.value;
            sb.append(cur.idx).append(" ");
        }
        sb.append(deque.poll().idx);

        System.out.println(sb);
    }
}
