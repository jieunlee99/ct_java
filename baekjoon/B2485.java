package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = gcd_n(arr);

        int count = 0;
        for(int i=1; i<n; i++) {
            count += (arr[i]-arr[i-1])/gcd - 1;
        }

        System.out.println(count);
    }

    static int gcd_1(int a, int b) {
        int r;
        while(b!=0) {
            r = a%b;
            a = b;
            b= r;
        }
        return a;
    }

    static int gcd_n(int[] arr) {
        int gcd = arr[1]-arr[0];
        for(int i=2; i<arr.length; i++) {
            int temp = gcd_1(gcd, arr[i]-arr[i-1]);
            if(gcd > temp)
                gcd = temp;
        }
        return gcd;
    }
}
