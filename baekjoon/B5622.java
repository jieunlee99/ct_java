package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[] {
                2, 2, 2,
                3, 3, 3,
                4, 4, 4,
                5, 5, 5,
                6, 6, 6,
                7, 7, 7, 7,
                8, 8, 8,
                9, 9, 9, 9
        };

        int result = 0;
        for(int i=0; i<str.length(); i++) {
            result += arr[(int)(str.charAt(i))-65]+1;
        }
        System.out.println(result);
    }
}
