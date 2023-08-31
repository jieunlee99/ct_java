package baekjoon;

import java.util.Scanner;
import java.math.BigInteger;

public class b11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger C = scanner.nextBigInteger();

        System.out.println(A.add(B).add(C));
    }
}
