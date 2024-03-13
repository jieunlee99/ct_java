package bj;

// ref -> https://velog.io/@gayeong39/백준-2745-진법-변환JAVA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int tmp = 1; // B진법을 위한 변수
        int sum = 0; // 결과값

        for(int i=N.length()-1; i>=0; i--) {
            char C = N.charAt(i);
            if('A'<=C && C<='Z') { // 알파벳일 때
                sum += (C-'A'+10)*tmp;
            } else { // 숫자일 때
                sum += (C-'0')*tmp;
            }
            tmp *= B;
        }

        System.out.println(sum);
    }
}
