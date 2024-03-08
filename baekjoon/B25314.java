package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int longN = (int) Math.ceil((double)N/4);

        String result = "";
        for(int i=0; i<longN; i++) {
            result += "long ";
        }
        System.out.println(result+"int");
    }
}
