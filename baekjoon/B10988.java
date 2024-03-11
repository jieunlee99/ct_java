package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String reverse = new StringBuffer(word).reverse().toString();

        if(word.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
