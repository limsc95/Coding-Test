package baekjoon.BJ30402_감마선맞은컴퓨터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ30402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[15][15];
        String answer = "";

        for (int i = 0; i < 15; i++) {
            String[] tokens = br.readLine().split(" ");
            for (int j = 0; j < 15; j++) {
                arr[i][j] = tokens[j].charAt(0);
            }
        }

        outer:
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                char ch = arr[i][j];

                if (ch == 'w' || ch == 'W') {
                    answer = "chunbae";
                    break outer;
                }
                else if (ch == 'b' || ch == 'B') {
                    answer = "nabi";
                    break outer;
                }
                else if (ch == 'g' || ch == 'G') {
                    answer = "yeongcheol";
                    break outer;
                }
            }
        }
        System.out.println(answer);
    }
}
