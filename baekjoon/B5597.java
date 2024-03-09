package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] ch = new boolean[30];

        int num;
        for(int i=0; i<28; i++) {
            num = Integer.parseInt(br.readLine());
            ch[num-1] = true;
        }

        for (int i=0; i<30; i++) {
            if(ch[i] == false) System.out.println(i+1);
        }
    }
}
