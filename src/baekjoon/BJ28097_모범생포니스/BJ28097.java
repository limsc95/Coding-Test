package baekjoon.BJ28097_모범생포니스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ28097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = (N-1) * 8;

        for (int i = 0; i < N; i++) {
            int t = Integer.parseInt(st.nextToken());
            answer += t;
        }
        System.out.println(answer/24 + " " + answer%24);
    }
}
