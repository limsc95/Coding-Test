package baekjoon.BJ2693_N번째큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int third = third(st);

            sb.append(third);
            if (n != 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int third(StringTokenizer st) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (x > first) {
                third = second;
                second = first;
                first = x;
            } else if (x > second && x < first) {
                third = second;
                second = x;
            } else if (x > third && x < second) {
                third = x;
            }
        }
        return third;
    }
}
