package baekjoon.BJ23804_골뱅이찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ23804 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        whelk(1, 5);
        whelk(3, 1);
        whelk(1, 5);

    }

    static void whelk(int x, int y) {
        for (int i = 0; i < x * N; i++) {
            for (int j = 0; j < y * N; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
