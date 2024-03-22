package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            long num = Long.parseLong(br.readLine());
            if(num == 0 || num == 1) {
                System.out.println(2);
                continue;
            }
            while(!isPrime(num)) {
                num++;
            }
            System.out.println(num);
        }
    }

    static boolean isPrime(long n) {
        for(long i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
