import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1550 {
    public static void main(String[] args) throws Exception{
        // Scanner보다 속도가 빠르다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();

        // parseInt 통해서 16진수 String을 10진수로 변경 가능
        System.out.println(Integer.parseInt(hex, 16));
    }
}
