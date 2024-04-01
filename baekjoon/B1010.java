package bj;

// BigInteger 사용하

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class B1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        int n, k;
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            k = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            System.out.println(factorial(n).divide(factorial(n-k).multiply(factorial(k))));

        }

    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for(long i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
