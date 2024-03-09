package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex+1);
    }
}
