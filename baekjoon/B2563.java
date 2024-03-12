package bj;

// ref -> https://velog.io/@whdgkr9070/백준-2563.-색종이-문제-풀이-JAVA자바

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[100][100];

        int result = 0;
        int x, y;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for(int j=x; j<x+10; j++) {
                for(int k=y; k<y+10; k++) {
                    if(!arr[j][k]){
                        arr[j][k] = true;
                        result += 1;
                    }
                }
            }
        }


        System.out.println(result);
    }
}
