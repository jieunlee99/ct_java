package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2447 {
    static StringBuilder sb = new StringBuilder();
    static int n;

    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new String[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(arr[i], " ");
        }
        
    }

    static void drawStar(int x, int y, int n, boolean isBlank) {

    }
}
