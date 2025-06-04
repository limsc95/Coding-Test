package baekjoon.BJ1629_곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1629 {
    static long A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(B));
    }
    static long pow(long exp) {
        if (exp == 0) {
            return 1;
        }

        long half = pow(exp / 2);

        if (exp % 2 == 0) {
            return (half * half) % C;
        }
        else {
            return (half * half % C) * A % C;
        }
    }
}
