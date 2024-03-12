package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 5줄, 한줄에 최대 15글자씩..
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for(int j=0; j<input.length(); j++) {
                arr[i][j] = String.valueOf(input.charAt(j));
            }
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] == null) continue;
                System.out.print(arr[j][i]);
            }

        }

    }
}
