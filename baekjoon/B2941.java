package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] cAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = br.readLine();

        int count = 0;
        for(String c: cAlpha) {
            if(word.contains(c)) {
                word = word.replace(c, "*");
            }
        }

        System.out.println(word.length());
    }
}
