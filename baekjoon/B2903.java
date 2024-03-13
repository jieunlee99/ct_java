package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 4;
        for(int i=1; i<=N; i++) {
            int temp = (int) Math.sqrt(result);
            result = (int)Math.pow(2*temp-1, 2);
        }
        System.out.println(result);
    }
}
