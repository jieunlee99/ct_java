package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i =1 ;
        while(N > 0) {
            if(N == 1) break;
            N-=i*6;
            i++;
        }

        System.out.println(i);
    }
}
