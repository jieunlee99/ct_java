package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14888 {
    static StringBuilder sb = new StringBuilder();
    static int[] visited;
    static int n, result;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        int[] arr = new int[n]; // N개의 수
        int[] op = new int[4]; // 각 연산자 4개의 합이 N-1

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(0);


    }

    public static void backtracking(int depth) {

    }
}
