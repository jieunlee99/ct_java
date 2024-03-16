package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B15894 {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BigInteger n = new BigInteger(br.readLine());

       System.out.println(n.multiply(new BigInteger(String.valueOf(4))));
   }
}
