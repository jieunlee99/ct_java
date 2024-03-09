package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(String.valueOf(new StringBuffer(st.nextToken()).reverse()));
        int B = Integer.parseInt(String.valueOf(new StringBuffer(st.nextToken()).reverse()));

        System.out.println(A>B?A:B);
    }
}
