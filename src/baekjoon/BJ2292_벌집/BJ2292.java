package baekjoon.BJ2292_벌집;

import java.util.Scanner;

public class BJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        N--;

        while (N > 0) {
            N = N - 6 * count;
            count++;
        }
        System.out.println(count);
    }
}
