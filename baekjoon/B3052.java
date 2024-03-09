package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> remainder = new ArrayList<>();

        int num;


        for(int i=0; i<10; i++) {
            num = Integer.parseInt(br.readLine());
            if(!remainder.contains(num%42)) {
                remainder.add(num%42);
            }
        }

        System.out.println(remainder.size());
    }
}
