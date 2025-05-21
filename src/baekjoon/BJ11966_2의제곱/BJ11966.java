package baekjoon.BJ11966_2의제곱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = n;

        while (true) {
            if (x == 2 || n == 1){
                System.out.println(1);
                break;
            }else if (x % 2 == 1){
                System.out.println(0);
                break;
            }
            x = x / 2;
        }
    }
}
