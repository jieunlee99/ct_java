package bj;

// ref -> https://velog.io/@dustle/백준-4949번-균형-잡힌-세상-Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while(!(str = br.readLine()).equals(".")) {
            Stack<String> stack = new Stack<>();
            String[] list = str.split("");
            for(String word:list) {
                switch (word) {
                    case("("):
                    case("["):
                        stack.push(word);
                        break;
                    case(")"):
                        if(!stack.isEmpty()&&stack.peek().equals("(")) {
                            stack.pop();
                        } else {
                            stack.push(word);
                        }
                        break;
                    case("]"):
                        if(!stack.isEmpty()&&stack.peek().equals("[")) {
                            stack.pop();
                        } else {
                            stack.push(word);
                        }
                        break;
                }
            }

            if(stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
