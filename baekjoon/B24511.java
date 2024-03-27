package bj;

// ref -> https://akys159357.tistory.com/345

import java.io.*;
import java.util.*;

public class B24511 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st;

        // 1. n 입력 받기
        int n = Integer.parseInt(br.readLine());

        // 2. 각 자료구조 입력 받기
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 각 자료구조에 들어가는 원소 값 입력 받기
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            // 스택은 후입선출이기 때문에 달라지지 않지만, 큐는 선입선출이기 때문에 달라짐
            if(arr[i] == 0)  // 큐
                deque.offer(tmp);
        }

        // 4. 삽입할 수열의 길이 입력 받기
        int m = Integer.parseInt(br.readLine());

        // 5. queuestack에 삽입할 원소를 담고 있는 수열 입력 받기
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            deque.offerFirst(tmp);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
