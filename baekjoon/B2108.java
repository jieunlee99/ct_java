package bj;

// ref -> https://yermi.tistory.com/entry/백준BOJ-2108번-통계학-JAVA-자바

import java.io.*;
import java.util.*;

public class B2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        double sum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int count = 0;
        int max = -1;
        int mod = arr[0];

        boolean check = false; // 만약에 최빈값이 여러 개라면 그중에서 두번째로 작은 값..

        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) {
                count += 1;
            } else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            } else if (max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }

        System.out.println(Math.round(sum/n)); // 평균
        System.out.println(arr[n/2]); // 중앙값
        System.out.println(mod); // 최빈값
        System.out.println(arr[n-1]-arr[0]);
    }
}
