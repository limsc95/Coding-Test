package baekjoon.BJ24389_2의보수;

import java.util.Scanner;

public class BJ24389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int negN = -N;
        int xor = N ^ negN;

        System.out.println(Integer.bitCount(xor));
    }
}
