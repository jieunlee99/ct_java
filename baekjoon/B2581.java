package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int result = 0;
        int min = -1;
        boolean isPrime;
        for(int i=N; i<=M; i++) {
            isPrime = true;
            if(i==1) continue;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                if(result == 0) min = i;
                result += i;
            }
        }

        if(result == 0) System.out.println(-1);
        else {
            System.out.println(result);
            System.out.println(min);
        }
    }
}
