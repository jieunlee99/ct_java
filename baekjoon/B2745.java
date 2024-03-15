package bj;

// ref -> https://velog.io/@gayeong39/백준-2745-진법-변환JAVA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
       // 다시 풀기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int mul = 1;
        int result = 0;
        for(int i=n.length()-1; i>=0; i--) {
            char tmp = n.charAt(i);
            if ('0' <= tmp && tmp <='9') { // 숫자일 때
                result += mul*Integer.parseInt(String.valueOf(tmp));
            } else if ('A' <= tmp && tmp <='Z') { // 알파벳일 때
                result += mul*(tmp-'A'+10);
            }
            mul *= b;
        }

        System.out.println(result);
    }
}
