import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B14928 {
    public static void main(String[] args) throws Exception{
//        [so1] 시간 초과
//        Scanner sc = new Scanner(System.in);
//        BigInteger N = sc.nextBigInteger();
//        System.out.println(N.mod(BigInteger.valueOf(20000303)));

        // 나머지 연산 분배법칙 이용
        // (A + B) % N = ((A % N) + (B % N)) % N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();

        int reminder = 0;

        for(int i=0; i<strN.length();i++){
            reminder = (reminder*10+(strN.charAt(i)-'0'))%20000303;
        }

        br.close();

        System.out.println(reminder);
    }
}
