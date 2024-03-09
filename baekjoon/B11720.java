package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class B11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Optional<Integer> result = Arrays.stream(br.readLine().split("")).map(x->Integer.parseInt(x)).reduce((sum, x) -> sum + x);
        System.out.println(result.get());
    }
}
