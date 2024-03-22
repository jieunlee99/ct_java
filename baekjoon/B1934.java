package bj;

// ref -> https://imkh.dev/algorithm-gcd-lcm

import java.io.*;
import java.util.*;

public class B1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " R");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(lcm(a,b));
        }
    }

    // 2개의 자연수 a, b(a > b)에 대해서 a를 b로 나눈 나머지가 r일 때,
    // a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
    static int gcd(int a, int b) {
        int r;
        while(b!=0) {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수 = 두 수의 곱 / 최대공약수
    static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
}
