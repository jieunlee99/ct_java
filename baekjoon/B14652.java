import java.util.Scanner;

public class B14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.print(k/m);
        System.out.print(" ");
        System.out.println(k%m);
    }
}
