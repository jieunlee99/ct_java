package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int v = Integer.parseInt(br.readLine());

        long result = Arrays.stream(input.split(" ")).map(x->Integer.parseInt(x)).filter(x-> x == v).count();
        System.out.println(result);
    }
}
