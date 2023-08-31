package baekjoon;

import java.math.BigInteger;
import java.util.Scanner; // Scanner 클래스 호출

public class b1271 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Biginteger의 범위는 문자열 형태로 이루어져 있어 무한이다.
        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();

        // 문자열 형태로 이루어져 있어 사칙연산이 불가능하다.
        // 클래스 내부의 함수를 이용해야 한다. (add, subtract, multiply, divide)
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

    }
}
