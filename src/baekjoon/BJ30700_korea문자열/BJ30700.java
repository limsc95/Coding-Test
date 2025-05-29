package baekjoon.BJ30700_korea문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ30700 {
    public static void main(String[] args) throws IOException {

        char[] korea = {'K', 'O', 'R', 'E', 'A'};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == korea[x]) {
                count++;
                x++;
                if (x > 4) { x = 0; }
            }
        }

        System.out.println(count);
    }
}
