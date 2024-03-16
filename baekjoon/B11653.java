package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N==1) System.exit(0);
        for(int i=2; i<=N; i++) {
            while(N%i == 0) {
                System.out.println(i);
                N = N/i;
            }
        }
    }
}
