package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int tmp = 1;
        String result = "";

        int digit;
        while(N != 0) {
            // 1. N%tmp 값(숫자)을 문자열로 바꿔서 result에 더해준다.
            digit = N%tmp;
            if(digit < 10) {
                result += digit;
            } else {
                result += (char)(digit-10)+'A';
            }
            // 2. N에서 N%tmp 값을 빼서 업데이트해준다.
            N = N - N%tmp;
            // 3. tmp*=B
            tmp *= B;
            System.out.println(N);
        }

        System.out.println(result);
    }
}
