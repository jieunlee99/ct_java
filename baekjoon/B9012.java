package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String[] str = br.readLine().split("");
            isRight(str);
        }
    }

    static void isRight(String[] str) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("(")) {
                stack.push("(");
            } else {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
