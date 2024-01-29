import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10의 1000 승까지 표현하기 위해서 BigInteger 사용해야 한다.
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        System.out.println(n.divide(m));
        System.out.println(n.mod(m));
    }
}
