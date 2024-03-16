package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;

        int cnt, m;
        for(int i=0;i<N; i++) {
            cnt = 0;
            m = Integer.parseInt(st.nextToken());
            if(m == 1) {
                continue;
            }
            for(int j=2; j<=Math.sqrt(m); j++) {
                if(m%j == 0) cnt += 1;
            }
            if(cnt == 0) result += 1;
        }

        System.out.println(result);
    }
}
