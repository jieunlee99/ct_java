package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        while(true) {
            n = Integer.parseInt(br.readLine());
            if(n == -1) break;
            System.out.println(result(n));
        }
    }

    static String result(int num) {
        int sum = 1;
        String result = " = 1";
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                sum += i;
                result += " + "+i;
            }
        }

        if(sum == num)
            return num + result;
        else
            return num + " is NOT perfect.";
    }
}
