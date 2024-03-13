package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int change, q, d, n, p;
        for(int i=0; i<T; i++) {
            change = Integer.parseInt(br.readLine());
            q = change/25;
            change %= 25;
            d = change/10;
            change %= 10;
            n = change/5;
            change %= 5;
            p = change/1;

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}
