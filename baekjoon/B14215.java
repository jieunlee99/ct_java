package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int [] arr= new int[3];
        for(int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int max = arr[0]+arr[1]-1;
        if(arr[2] >= max) {
            System.out.println(arr[0]+arr[1]+max);
        } else {
            System.out.println(arr[0]+arr[1]+arr[2]);
        }

    }
}