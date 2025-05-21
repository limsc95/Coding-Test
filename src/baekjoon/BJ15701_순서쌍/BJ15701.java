package baekjoon.BJ15701_순서쌍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ15701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                System.out.println(i + ", " + n/i);
                if (i == n/i){count++;}
                else {count+=2;}
            }
        }
        System.out.println(count);
    }
}
