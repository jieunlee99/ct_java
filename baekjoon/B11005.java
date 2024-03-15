package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10진법 수 -> b진법 수
public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String result = "";

        while(n != 0) {
            if(0<=n%b && n%b<=9) {
                result = n%b + result;
            } else {
                result = (char)('A'+n%b-10) +result;
            }

            n = n/b;
        }

        System.out.println(result);
    }
}
