package bj;

// ref -> https://echung93.tistory.com/42

import java.io.*;
import java.util.*;

public class B10814 {
    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age+" "+name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Member[] members = new Member[n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(members, Comparator.comparingInt(m -> m.age));

        for (Member m: members) {
            System.out.println(m);
        }
    }
}
