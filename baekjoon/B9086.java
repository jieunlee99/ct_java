package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String str;
        for(int i=0; i<T; i++) {
            str = br.readLine();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
}
