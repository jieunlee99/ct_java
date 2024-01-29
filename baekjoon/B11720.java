import java.util.*;

public class B11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int sum = 0;

        // 문자열 분리
        // 1. String.split("")
        // 2. String.toCharArray()
        // 3. String.charAt(i)
        // 4. Stream 이용

        for(int i=0; i<num; i++){
//            System.out.println(input.charAt(i));
            sum += Character.getNumericValue(input.charAt(i));
        }

        System.out.println(sum);
    }
}
