package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[9][9];

        int maxValue = Integer.MIN_VALUE;
        int maxI = -1;
        int maxJ = -1;

        for(int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println((maxI+1)+" "+(maxJ+1));
    }
}
