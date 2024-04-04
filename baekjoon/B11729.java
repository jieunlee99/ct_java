package bj;

// ref -> https://code-master-s.tistory.com/37

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11729 {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        move(n, 1, 3, 2);

        System.out.println(cnt);
        System.out.println(sb);
    }

    static void move(int n, int from, int to, int temp) {

        // n이 1이라면, temp 없이 from에서 to로 바로 이동 가능
        if(n == 1) {
            cnt++;
            sb.append(from+" "+to).append("\n");
            return;
        }

        // n이 1이 아니라면
        // 1. n-1개를 from에서 temp로 이동
        // 2. 가장 큰 원판을 from에서 to로 이동
        // 3. n-1개를 temp에서 to로 이동
        move(n-1, from, temp, to); // 1
        cnt++;
        sb.append(from+" "+to).append("\n");
        move(n-1, temp, to, from); // 3
    }
}
